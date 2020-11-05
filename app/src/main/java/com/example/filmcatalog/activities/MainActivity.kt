package com.example.filmcatalog.activities

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.filmcatalog.databinding.ActivityMainBinding
import com.example.filmcatalog.entities.TestData
import kotlinx.android.synthetic.main.activity_main.view.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        val binding = ActivityMainBinding.inflate(layoutInflater)
        val view = binding.root

        setContentView(view)

        view.main_activity_textview.setOnClickListener { moveToNextScreen() }
    }

    private fun moveToNextScreen() {
        val intent = Intent(this, SecondActivity::class.java)
        val data = TestData()

        intent.putExtra(SecondActivity.DATA, data)

        startActivity(intent)
    }
}