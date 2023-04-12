package com.furkanagace.mobilearncode

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import com.furkanagace.mobilearncode.R.*

class kotlinPage1 : AppCompatActivity() {
    @SuppressLint("WrongViewCast")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(layout.activity_kotlin_page1)


       val kotlinkonular = findViewById<Button>(id.geritus)
        kotlinkonular.setOnClickListener{
            val intent=Intent(this,AnaPalet::class.java)
            startActivity(intent)
        }



        val kotPage1 = findViewById<Button>(id.page1)

        kotPage1.setOnClickListener {
            val intent = Intent(this, kotlinders1::class.java)
            startActivity(intent)
        }
        val kotPage2 = findViewById<Button>(id.page2)

        kotPage2.setOnClickListener {
            val intent = Intent(this, kotlinders2::class.java)
            startActivity(intent)
        }
        val kotPage3= findViewById<Button>(id.page3)

        kotPage3.setOnClickListener {
            val intent = Intent(this, kotlinders3::class.java)
            startActivity(intent)
        }
        val kotPage4 = findViewById<Button>(id.page4)

        kotPage4.setOnClickListener {
            val intent = Intent(this, kotlinders4::class.java)
            startActivity(intent)
        }
        val kotPage5 = findViewById<Button>(id.page5)

        kotPage5.setOnClickListener {
            val intent = Intent(this, kotlinders5::class.java)
            startActivity(intent)
        }
        val kotPage6 = findViewById<Button>(id.page6)

        kotPage6.setOnClickListener {
            val intent = Intent(this, kotlinders6::class.java)
            startActivity(intent)
        }
        val kotPage7 = findViewById<Button>(id.page7)

        kotPage7.setOnClickListener {
            val intent = Intent(this, kotlinders7::class.java)
            startActivity(intent)
        }
        val kotPage8 = findViewById<Button>(id.page8)

        kotPage8.setOnClickListener {
            val intent = Intent(this, kotlinders8::class.java)
            startActivity(intent)
        }
        val kotPage9 = findViewById<Button>(id.page9)

        kotPage9.setOnClickListener {
            val intent = Intent(this, kotlinders9::class.java)
            startActivity(intent)
        }
        val kotPage10 = findViewById<Button>(id.page10)

        kotPage10.setOnClickListener {
            val intent = Intent(this, kotlinders10::class.java)
            startActivity(intent)
        }
        val kotPage11 = findViewById<Button>(id.page11)

        kotPage11.setOnClickListener {
            val intent = Intent(this, kotlinders11::class.java)
            startActivity(intent)
        }
        val kotPage12 = findViewById<Button>(id.page12)

        kotPage12.setOnClickListener {
            val intent = Intent(this, kotlinders12::class.java)
            startActivity(intent)
        }

        val kotPage13 = findViewById<Button>(id.page13)

        kotPage13.setOnClickListener {
            val intent = Intent(this, kotlinDers13::class.java)
            startActivity(intent)
        }

    }
}