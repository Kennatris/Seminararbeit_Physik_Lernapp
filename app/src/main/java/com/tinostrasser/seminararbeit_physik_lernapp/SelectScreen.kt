package com.tinostrasser.seminararbeit_physik_lernapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.Button
import android.widget.Spinner

class SelectScreen : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_select_screen)

        val spinnerPhysicTheme = findViewById<Spinner>(R.id.spinnerPhysicTheme)
        var adapter = ArrayAdapter.createFromResource(this, R.array.PhysicTheme, android.R.layout.simple_spinner_item)
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_item)
        spinnerPhysicTheme.adapter = adapter

        val launchButton = findViewById<Button>(R.id.btnSearch)

        launchButton.setOnClickListener {
            val item = spinnerPhysicTheme.getItemAtPosition(spinnerPhysicTheme.selectedItemPosition).toString()

            val intent: Intent = when (item) {
                "Das magnetische Feld" -> Intent(this, MagnetischeFeld::class.java)
                "Das elektrische Feld" -> Intent(this, SelectScreen::class.java)
                "Das Gravitationsfeld" -> Intent(this, SelectScreen::class.java)
                "Teilchen in Feldern" -> Intent(this, SelectScreen::class.java)
                else -> Intent(this, SelectScreen::class.java)
            }

            /*
            if (item == "Das magnetische Feld") {
                Intent(this, MainActivity::class.java)
            } else if (item == "Das elektrische Feld") {
                Intent(this, SelectScreen::class.java)
            } else if (item == "Das Gravitationsfeld") {
                Intent(this, SelectScreen::class.java)
            } else if (item == "Teilchen in Feldern") {
                Intent(this, SelectScreen::class.java)
            } else {
                Intent(this, SelectScreen::class.java)
            }
            */

            startActivity(intent)
        }
    }
}