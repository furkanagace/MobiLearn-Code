package com.furkanagace.mobilearncode

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class kotlinders5 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_kotlinders5)
        val geriPage1 =findViewById<Button>(R.id.geri1)

        geriPage1.setOnClickListener(){
            val  intent= Intent(this,kotlinPage1::class.java)
            startActivity(intent)
        }

    }
}