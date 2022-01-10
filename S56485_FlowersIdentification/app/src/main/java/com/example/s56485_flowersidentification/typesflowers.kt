package com.example.s56485_flowersidentification

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView

class typesflowers : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_typesflowers)

        val btnMenuPage = findViewById<Button>(R.id.btnMenu2)
        btnMenuPage.setOnClickListener(){
            val intent = Intent(this, MenuPage::class.java).apply {
            }
            startActivity(intent)
        }

        val btnsunflower = findViewById<Button>(R.id.btnSun)
        btnsunflower.setOnClickListener(){
            val intent = Intent(this, sunflower::class.java).apply {
            }
            startActivity(intent)
        }

        val btnrose = findViewById<Button>(R.id.btnRose)
        btnrose.setOnClickListener(){
            val intent = Intent(this, Rose::class.java).apply {
            }
            startActivity(intent)
        }

        val btnhibiscus = findViewById<Button>(R.id.btnHibiscus)
        btnhibiscus.setOnClickListener(){
            val intent = Intent(this, hibiscus::class.java).apply {
            }
            startActivity(intent)
        }

        val btntulip = findViewById<Button>(R.id.btnTulip)
        btntulip.setOnClickListener(){
            val intent = Intent(this, tulip::class.java).apply {
            }
            startActivity(intent)
        }

        val btndaisy = findViewById<Button>(R.id.btnDaisy)
        btndaisy.setOnClickListener(){
            val intent = Intent(this, daisy::class.java).apply {
            }
            startActivity(intent)
        }

        val btnrafflesia = findViewById<Button>(R.id.btnRaff)
        btnrafflesia.setOnClickListener(){
            val intent = Intent(this, rafflesia::class.java).apply {
            }
            startActivity(intent)
        }

        val btnExit = findViewById<Button>(R.id.btnExit1)
        btnExit.setOnClickListener(){
            finishAffinity()
        }
    }
    }
