package com.example.filmcatalog.activities

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.filmcatalog.databinding.ActivitySecondBinding
import com.example.filmcatalog.entities.TestData

class SecondActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        val binding = ActivitySecondBinding.inflate(layoutInflater)
        val view = binding.root

        setContentView(view)

        val data = intent.getParcelableExtra<TestData>(SecondActivity.DATA)

        binding.secondActivityTextview.text = "These values were passed from previous screen: transmittedString: ${data?.transmittedString}, transmittedInt: ${data?.transmittedInt}, transmittedBoolean: ${data?.transmittedBoolean}"
    }

    companion object {
        const val DATA = "data"
    }
}