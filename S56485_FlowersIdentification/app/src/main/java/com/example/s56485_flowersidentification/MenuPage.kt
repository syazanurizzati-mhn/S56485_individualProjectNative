package com.example.s56485_flowersidentification

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import kotlin.system.exitProcess

class MenuPage : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_menu_page)

        val btnHome = findViewById<Button>(R.id.btnHome)
        btnHome.setOnClickListener(){
            val intent = Intent(this, MainActivity::class.java).apply {
            }
            startActivity(intent)
        }

        val btnInt = findViewById<Button>(R.id.btnIntro)
        btnInt.setOnClickListener(){
            val intent = Intent(this, introduction::class.java).apply {
            }
            startActivity(intent)
        }

        val btnTypes = findViewById<Button>(R.id.btnFlowers)
        btnTypes.setOnClickListener(){
            val intent = Intent(this, typesflowers::class.java).apply {
            }
            startActivity(intent)
        }
        val btnExit = findViewById<Button>(R.id.btnExit)
        btnExit.setOnClickListener(){
            finishAffinity()
            }
        }

    }
