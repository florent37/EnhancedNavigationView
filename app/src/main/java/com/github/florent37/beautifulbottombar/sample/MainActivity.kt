package com.github.florent37.beautifulbottombar.sample

import android.os.Bundle
import android.support.design.widget.BottomNavigationView
import android.support.v7.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val bottomNavigation = findViewById<BottomNavigationView>(R.id.bottom_navigation)
        bottomNavigation.setOnNavigationItemSelectedListener {item ->
            when(item.itemId){
                R.id.action_0 -> { /* your action */ }
                //...
            }
            return@setOnNavigationItemSelectedListener true
        }
    }
}
