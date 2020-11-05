package com.example.filmcatalog.activities

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.filmcatalog.databinding.ActivitySecondBinding
import com.example.filmcatalog.entities.Student

class SecondActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        val binding =  ActivitySecondBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)

        val student: Student? = intent.getParcelableExtra<Student>(SecondActivity.STUDENT)

        binding.secondActivityTextview.text = "Student name: ${student?.name}, student age: ${student?.age}"
    }

    companion object {
        const val STUDENT = "student"
    }
}