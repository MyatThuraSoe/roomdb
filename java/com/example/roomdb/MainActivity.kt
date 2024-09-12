package com.example.roomdb

import android.os.Bundle

import androidx.appcompat.app.AppCompatActivity

import androidx.navigation.findNavController

import androidx.navigation.ui.setupWithNavController

import com.google.android.material.bottomnavigation.BottomNavigationView



class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)

        setContentView(R.layout.activity_main)



//         val navView=findViewById<BottomNavigationView>(R.id.nav_bottom_view)
//
//         val navController=findNavController(R.id.fragmentContainerView)
//
//         navView.setupWithNavController
        findViewById<BottomNavigationView>(R.id.nav_bottom_view).setupWithNavController(findNavController(R.id.fragmentContainerView))

    }

}