package com.example.filmcatalog

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import timber.log.Timber

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        Timber.i("onStart Called")

        val textView: TextView = findViewById(R.id.hello_world_activity)

        textView.setOnClickListener { implictIntend() }

        setContentView(R.layout.activity_main)
    }

    private fun implictIntend() {
        val address = Uri.parse("http://developer.android.com")
        val openLinkIntent = Intent(Intent.ACTION_VIEW, address)

        startActivity(openLinkIntent)
    }

    override fun onResume() {
        super.onResume()
        Timber.i("onResume Called")
    }

    override fun onPause() {
        super.onPause()
        Timber.i("onPause Called")
    }

    override fun onStop() {
        super.onStop()
        Timber.i("onStop Called")
    }

    override fun onDestroy() {
        super.onDestroy()
        Timber.i("onDestroy Called")
    }

    override fun onRestart() {
        super.onRestart()
        Timber.i("onRestart Called")
    }
}