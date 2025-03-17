package com.example.praktikum_pemesanantiketpesawat

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class MaskapaiActivity : AppCompatActivity() {
    private lateinit var btnHome: Button
    private lateinit var btnLogin: Button
    private lateinit var btnRegister: Button
    private lateinit var btnPesan: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_maskapai)
        btnHome = findViewById(R.id.btnHome)
        btnLogin = findViewById(R.id.btnLogin)
        btnRegister = findViewById(R.id.btnRegister)
        btnPesan = findViewById(R.id.btnPesan)

        btnHome.setOnClickListener({
            val intent = Intent(this@MaskapaiActivity, MainActivity::class.java)
            startActivity(intent)
        })

        btnLogin.setOnClickListener({
            val intent = Intent(this@MaskapaiActivity, LoginActivity::class.java)
            startActivity(intent)
        })

        btnRegister.setOnClickListener({
            val intent = Intent(this@MaskapaiActivity, RegisterActivity::class.java)
            startActivity(intent)
        })

        btnPesan.setOnClickListener({
            // Intent untuk membuka kamera
            val cameraIntent = Intent(android.provider.MediaStore.ACTION_IMAGE_CAPTURE)
            startActivity(cameraIntent)

            // Setelah kamera terbuka, lanjutkan dengan intent share (ACTION_SEND)
            val shareIntent = Intent(Intent.ACTION_SEND).apply {
                type = "text/plain"
                putExtra(Intent.EXTRA_TEXT, "Saya telah memesan tiket pesawat dan membuka kamera! 🛬📸")
            }
            startActivity(Intent.createChooser(shareIntent, "Bagikan via:"))
        })
    }
}

