package com.example.s56485_flowersidentification

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class hibiscus : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_hibiscus)
        val btnExit = findViewById<Button>(R.id.btnExit2)
        btnExit.setOnClickListener(){
            finishAffinity()
        }
        val btnBack = findViewById<Button>(R.id.btnBack)
        btnBack.setOnClickListener(){
            val intent = Intent(this, typesflowers::class.java).apply {
            }
            startActivity(intent)
        }
    }
    }
