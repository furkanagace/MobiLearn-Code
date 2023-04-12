package com.furkanagace.mobilearncode

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageButton
import com.furkanagace.mobilearncode.R.id.kotlinkonu1

class AnaPalet : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_ana_palet)

        val kotlinkonular = findViewById<Button>(R.id.kotlinkonu1)

        kotlinkonular.setOnClickListener {
            val intent = Intent(this, kotlinPage1::class.java)
            startActivity(intent)
        }

        val kotlinsinavlar = findViewById<Button>(R.id.kotlinkonu2)

        kotlinsinavlar.setOnClickListener {
            val intent = Intent(this, kotlinPage2::class.java)
            startActivity(intent)
        }
        val info = findViewById<Button>(R.id.info)

        info.setOnClickListener {
            val intent = Intent(this, social::class.java)
            startActivity(intent)
        }
    }
}
