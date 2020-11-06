package com.example.filmcatalog.activities

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.filmcatalog.databinding.ActivityProfileBinding
import com.example.filmcatalog.entities.User

class ProfileActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val binding = ActivityProfileBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)

        val user: User? = intent.getParcelableExtra<User>(ProfileActivity.USER)
        binding.profileTextview.text = "Привет, ${user?.login}"
    }

    companion object {
        const val USER = "user"
    }
}