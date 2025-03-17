package com.example.praktikum_pemesanantiketpesawat

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    private lateinit var btnLihat: Button
    private lateinit var btnLogin: Button
    private lateinit var btnRegister: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        btnLihat = findViewById(R.id.btnLihat)
        btnLogin = findViewById(R.id.btnLogin)
        btnRegister = findViewById(R.id.btnRegister)

        btnLihat.setOnClickListener({
            val intent = Intent(this@MainActivity, MaskapaiActivity::class.java)
            startActivity(intent)
        })

        btnLogin.setOnClickListener({
            val intent = Intent(this@MainActivity, LoginActivity::class.java)
            startActivity(intent)
        })

        btnRegister.setOnClickListener({
            val intent = Intent(this@MainActivity, RegisterActivity::class.java)
            startActivity(intent)
        })
    }
}

