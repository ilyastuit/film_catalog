package com.example.filmcatalog.activities

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.example.filmcatalog.databinding.ActivityMainBinding
import com.example.filmcatalog.entities.User

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val binding = ActivityMainBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)
        
        val button = binding.mainLoginButton

        button.setOnClickListener{ login(binding) }
    }

    private fun login(binding: ActivityMainBinding) {
        val login = binding.mainLoginText.text.toString()
        val password = binding.mainPasswordText.text.toString()

        if (login.isNotEmpty() && password.isNotEmpty()) {
            if (password.equals("1234")) {
                val intent = Intent(this, ProfileActivity::class.java)
                val user = User(login, password)

                intent.putExtra(ProfileActivity.USER, user)

                startActivity(intent)
            } else {
                Toast.makeText(this@MainActivity, "Неверный пароль!", Toast.LENGTH_LONG).show()
            }
        } else {
            Toast.makeText(this@MainActivity, "Заполните все поля!", Toast.LENGTH_LONG).show()
        }
    }
}