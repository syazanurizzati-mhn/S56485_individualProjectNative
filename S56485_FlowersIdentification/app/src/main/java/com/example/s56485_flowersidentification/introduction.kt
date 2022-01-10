package com.example.s56485_flowersidentification

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class introduction : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_introduction)

        val btnMenuPage = findViewById<Button>(R.id.btnMenu)
        btnMenuPage.setOnClickListener(){
            val intent = Intent(this, MenuPage::class.java).apply {
            }
            startActivity(intent)
        }

        val btnTypes = findViewById<Button>(R.id.btnFlowers1)
        btnTypes.setOnClickListener(){
            val intent = Intent(this, typesflowers::class.java).apply {
            }
            startActivity(intent)
        }
    }
}