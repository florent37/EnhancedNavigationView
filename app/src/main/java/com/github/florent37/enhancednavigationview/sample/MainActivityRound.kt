package com.github.florent37.enhancednavigationview.sample

import android.os.Bundle
import android.support.design.widget.BottomNavigationView
import android.support.v7.app.AppCompatActivity
import com.github.florent37.enhancednavigationview.EnhancedNavigationView

class MainActivityRound : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main_round)

        val bottomNavigation = findViewById<EnhancedNavigationView>(R.id.bottom_navigation)
        bottomNavigation.setOnNavigationItemSelectedListener {item ->
            when(item.itemId){
                R.id.action_0 -> { /* your action */ }
                //...
            }
            return@setOnNavigationItemSelectedListener true
        }
    }
}
