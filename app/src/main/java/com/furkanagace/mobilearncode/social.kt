package com.furkanagace.mobilearncode

import android.annotation.SuppressLint
import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageButton

class social : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_social)

        val kotlinkonular = findViewById<Button>(R.id.geritus)
        kotlinkonular.setOnClickListener{
            val intent=Intent(this,AnaPalet::class.java)
            startActivity(intent)
        }


        val openGithub = findViewById<ImageButton>(R.id.github)
        openGithub.setOnClickListener {
            val url = "https://www.github.com/furkanagace/"
            val intent = Intent(Intent.ACTION_VIEW, Uri.parse(url))
            startActivity(intent)
        }


        val openTwitter = findViewById<ImageButton>(R.id.twitter)
        openTwitter.setOnClickListener {
            val url = "https://www.twitter.com/furkanagacee/"
            val intent = Intent(Intent.ACTION_VIEW, Uri.parse(url))
            startActivity(intent)
        }


        val openLinkedin = findViewById<ImageButton>(R.id.linked)
        openLinkedin.setOnClickListener {
            val url = "https://www.linkedin.com/in/furkanagace/"
            val intent = Intent(Intent.ACTION_VIEW, Uri.parse(url))
            startActivity(intent)
        }
    }
}
