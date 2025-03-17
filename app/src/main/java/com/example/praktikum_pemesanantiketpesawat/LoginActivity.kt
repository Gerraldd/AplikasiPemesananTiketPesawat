package com.example.praktikum_pemesanantiketpesawat

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.praktikum_pemesanantiketpesawat.databinding.ActivityLoginBinding
import com.example.praktikum_pemesanantiketpesawat.databinding.ActivityMainBinding

class LoginActivity : AppCompatActivity() {
    private lateinit var btnHome: Button
    private lateinit var btnRegister: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)
        btnHome = findViewById(R.id.btnHome)
        btnRegister = findViewById(R.id.btnRegister)

        btnHome.setOnClickListener({
            val intent = Intent(this@LoginActivity, MainActivity::class.java)
            startActivity(intent)
        })

        btnRegister.setOnClickListener({
            val intent = Intent(this@LoginActivity, RegisterActivity::class.java)
            startActivity(intent)
        })
    }
}