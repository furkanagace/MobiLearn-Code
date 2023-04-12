package com.furkanagace.mobilearncode

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class kotlinDers13 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_kotlin_ders13)
        val geriPage1 =findViewById<Button>(R.id.geri1)

        geriPage1.setOnClickListener(){
            val  intent= Intent(this,kotlinPage1::class.java)
            startActivity(intent)
        }
    }
}