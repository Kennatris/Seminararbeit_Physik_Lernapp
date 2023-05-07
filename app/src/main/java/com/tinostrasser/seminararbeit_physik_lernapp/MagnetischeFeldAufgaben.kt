package com.tinostrasser.seminararbeit_physik_lernapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MagnetischeFeldAufgaben : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_magnetische_feld_aufgaben)

        val leichtButton = findViewById<Button>(R.id.btnLeicht)
        leichtButton.setOnClickListener {
            val Intent = Intent(this, MFA_Leicht::class.java)
            startActivity(Intent)
        }
    }


}