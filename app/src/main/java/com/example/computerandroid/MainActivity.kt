package com.example.computerandroid

import android.graphics.Color
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    private var compteur = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val textViewCompteur = findViewById<TextView>(R.id.textViewCompteur)

        val buttonIncrementer =
            findViewById<Button>(R.id.buttonIncrementer)

        val buttonDecrementer =
            findViewById<Button>(R.id.buttonDecrementer)

        val buttonPlus5 =
            findViewById<Button>(R.id.buttonPlus5)

        val buttonMoins5 =
            findViewById<Button>(R.id.buttonMoins5)

        val buttonReinitialiser =
            findViewById<Button>(R.id.buttonReinitialiser)

        buttonIncrementer.setOnClickListener {
            compteur++
            actualiserCompteur(textViewCompteur)
        }

        buttonDecrementer.setOnClickListener {
            compteur--
            actualiserCompteur(textViewCompteur)
        }

        buttonPlus5.setOnClickListener {
            compteur += 5
            actualiserCompteur(textViewCompteur)
        }

        buttonMoins5.setOnClickListener {
            compteur -= 5
            actualiserCompteur(textViewCompteur)
        }

        buttonReinitialiser.setOnClickListener {
            compteur = 0
            actualiserCompteur(textViewCompteur)
        }
    }
    private fun actualiserCompteur(textViewCompteur: TextView) {

        textViewCompteur.text = compteur.toString()
        if (compteur > 0) {
            textViewCompteur.setTextColor(Color.GREEN)
        } else if (compteur < 0) {
            textViewCompteur.setTextColor(Color.RED)
        } else {
            textViewCompteur.setTextColor(Color.BLACK)
        }
    }
}