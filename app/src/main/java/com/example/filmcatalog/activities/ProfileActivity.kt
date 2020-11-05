package com.example.filmcatalog.activities

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.filmcatalog.databinding.ActivityProfileBinding

class ProfileActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val binding = ActivityProfileBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)
    }
}