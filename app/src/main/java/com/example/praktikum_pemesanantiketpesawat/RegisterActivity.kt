package com.example.praktikum_pemesanantiketpesawat

import android.content.Intent
import android.os.Bundle
import android.util.Log
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class RegisterActivity : AppCompatActivity() {
    private lateinit var btnHome: Button
    private lateinit var btnLogin: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_register)
        btnHome = findViewById(R.id.btnHome)
        btnLogin = findViewById(R.id.btnLogin)

        btnHome.setOnClickListener({
            val intent = Intent(this@RegisterActivity, MainActivity::class.java)
            startActivity(intent)
        })

        btnLogin.setOnClickListener({
            val intent = Intent(this@RegisterActivity, LoginActivity::class.java)
            startActivity(intent)
        })
    }
}