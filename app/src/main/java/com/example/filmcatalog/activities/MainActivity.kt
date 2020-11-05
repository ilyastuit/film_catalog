package com.example.filmcatalog.activities

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.filmcatalog.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        val binding = ActivityMainBinding.inflate(layoutInflater)
        val view = binding.root

        setContentView(view)
    }
}