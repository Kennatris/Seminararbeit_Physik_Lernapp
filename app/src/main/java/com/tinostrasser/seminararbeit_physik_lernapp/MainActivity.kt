package com.tinostrasser.seminararbeit_physik_lernapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

var magnetAntworten_Leicht = 0

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val launchButton = findViewById<Button>(R.id.btnStart)

        launchButton.setOnClickListener {
            val Intent = Intent(this, SelectScreen::class.java)
            startActivity(Intent)
        }

    }

}