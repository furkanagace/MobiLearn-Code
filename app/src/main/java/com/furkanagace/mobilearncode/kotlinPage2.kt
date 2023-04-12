package com.furkanagace.mobilearncode

import android.annotation.SuppressLint
import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.ImageButton
import androidx.appcompat.app.AppCompatActivity

class kotlinPage2 : AppCompatActivity() {

    @SuppressLint("MissingInflatedId", "WrongViewCast")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_kotlin_page2)

        val geritusu4=findViewById<ImageButton>(R.id.gerigit)
        geritusu4.setOnClickListener{
            val intent=Intent(this,AnaPalet::class.java)
            startActivity(intent)
        }

        val kotlinsinav1= findViewById<Button>(R.id.kotlinsinav1)

        kotlinsinav1.setOnClickListener {
            val intent = Intent(this, sinav1::class.java)
            startActivity(intent)
        }

        val kotlinsinav2= findViewById<Button>(R.id.kotlinsinav2)

        kotlinsinav2.setOnClickListener {
            val intent = Intent(this, sinav2::class.java)
            startActivity(intent)
        }
        val kotlinsinav3= findViewById<Button>(R.id.kotlinsinav3)

        kotlinsinav3.setOnClickListener {
            val intent = Intent(this, sinav3::class.java)
            startActivity(intent)
        }


    }
}
