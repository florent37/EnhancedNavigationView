package com.github.florent37.enhancednavigationview

import android.content.Context
import android.graphics.Canvas
import android.graphics.Color
import android.support.annotation.ColorInt
import android.support.design.widget.BottomNavigationView
import android.util.AttributeSet
import android.view.Menu
import android.view.View
import android.view.ViewGroup
import com.github.florent37.mylittlecanvas.animation.ShapeAnimator
import com.github.florent37.mylittlecanvas.shape.CircleShape

open class EnhancedNavigationView : BottomNavigationView, View.OnLayoutChangeListener {
    override fun onLayoutChange(v: View?, left: Int, top: Int, right: Int, bottom: Int, oldLeft: Int, oldTop: Int, oldRight: Int, oldBottom: Int) {
        shapeAnimator
                .clear()
                .play(
                        circleShape.animate().centerXTo((left + right) / 2f)
                )
                .start()
    }

    private val circleShape = CircleShape().apply {
        color = Color.WHITE
    }

    @ColorInt
    var circleColor :  Int = Color.WHITE
        set(value){
            field = value
            circleShape.color = field
            postInvalidate()
        }

    var circleRadiusPercent = 1.8f
        set(value){
            field = value
            postInvalidate()
        }

    private val shapeAnimator = ShapeAnimator(this)

    private val items = mutableListOf<View>()

    private var listener: OnNavigationItemSelectedListener? = null

    private fun init() {
        setWillNotDraw(false)

        val bottomNavigationView = getChildAt(0) as ViewGroup
        for (index in 0 until bottomNavigationView.childCount) {
            items.add(bottomNavigationView.getChildAt(index))
        }

        super.setOnNavigationItemSelectedListener { itemMenu ->
            onNavigationChanged(itemMenu.itemId)

            return@setOnNavigationItemSelectedListener listener?.onNavigationItemSelected(itemMenu)
                    ?: false
        }
    }

    override fun setOnNavigationItemSelectedListener(listener: OnNavigationItemSelectedListener?) {
        this.listener = listener
    }


    constructor(context: Context) : super(context) {
        init()
    }

    constructor(context: Context, attrs: AttributeSet) : super(context, attrs) {
        init()
    }

    constructor(context: Context, attrs: AttributeSet, defStyleAttr: Int) : super(context, attrs, defStyleAttr) {
        init()
    }

    override fun onSizeChanged(w: Int, h: Int, oldw: Int, oldh: Int) {
        super.onSizeChanged(w, h, oldw, oldh)
        updateOnDraw()
    }

    private fun updateOnDraw() {
        circleShape
                .setRadius((height.toFloat() / 2f) * circleRadiusPercent)
                .centerVertical(height.toFloat())

        onNavigationChanged(selectedItemId)
    }

    override fun dispatchDraw(canvas: Canvas?) {
        circleShape.onDraw(canvas)
        super.dispatchDraw(canvas)
    }

    override fun setSelectedItemId(itemId: Int) {
        if (this.selectedItemId != itemId) {
            super.setSelectedItemId(itemId)
        }
    }

    fun getSelectedItemPosition() = menu.getItemPosition(selectedItemId)

    private fun onNavigationChanged(itemId: Int) {
        val item = menu.findItem(itemId)
        val position = menu.getItemPosition(itemId)

        if (item != null && position != null) {
            items.forEach {
                it.removeOnLayoutChangeListener(this)
            }
            items[position].addOnLayoutChangeListener(this)
        }
    }
}

fun Menu.getItemPosition(itemId: Int): Int? {
    for (i in 0 until this.size()) {
        if (itemId == this.getItem(i).itemId) {
            return i
        }
    }
    return -1
}
