package com.example.filmcatalog.activities

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.filmcatalog.R
import com.example.filmcatalog.databinding.ActivityMainBinding
import com.example.filmcatalog.entities.Student

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        val binding =  ActivityMainBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)

        binding.mainActivityTextview.setOnClickListener { moveToNextScreen() }
    }

    private fun moveToNextScreen() {
        intent = Intent(this, SecondActivity::class.java)
        val student: Student = Student("Ilyas", 22)
        intent.putExtra(SecondActivity.STUDENT, student)

        startActivity(intent)
    }
}