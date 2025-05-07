package com.example.praktikum_pemesanantiketpesawat

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    // Component
    private lateinit var btnLihat: Button
    private lateinit var btnHome: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btnLihat = findViewById(R.id.btnLihat)
        btnHome = findViewById(R.id.btnHome)

        btnLihat.setOnClickListener {
            val intent = Intent(this@MainActivity, MaskapaiActivity::class.java)
            startActivity(intent)
        }

        btnHome.setOnClickListener {
            Toast.makeText(this, "Anda sudah berada di halaman utama!", Toast.LENGTH_SHORT).show()
        }
    }
}

