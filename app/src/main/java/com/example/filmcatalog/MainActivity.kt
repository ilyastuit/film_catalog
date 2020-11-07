package com.example.filmcatalog

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        first_text.text = "First text."
        second_text.text = "Second text."
        third_text.text = "Third text."
        fourth_text.text = "Fourth text."
        fifth_text.text = "Fifth text."

        first_text.setOnClickListener { moveToSecondActivity() }
    }

    private fun moveToSecondActivity() {
        val intent = Intent(this, SecondActivity::class.java)

        startActivity(intent)
    }
}