package com.example.milkbuddy.view

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.milkbuddy.R
import androidx.navigation.findNavController


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val navController = findNavController(R.id.nav_host_fragment)
    }
}