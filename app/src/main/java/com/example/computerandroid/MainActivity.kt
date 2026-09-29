package com.example.computerandroid

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
            textViewCompteur.text = compteur.toString()
        }

        buttonDecrementer.setOnClickListener {
            compteur--
            textViewCompteur.text = compteur.toString()
        }

        buttonPlus5.setOnClickListener {
            compteur += 5
            textViewCompteur.text = compteur.toString()
        }

        buttonMoins5.setOnClickListener {
            compteur -= 5
            textViewCompteur.text = compteur.toString()
        }

        buttonReinitialiser.setOnClickListener {
            compteur = 0
            textViewCompteur.text = compteur.toString()
        }
    }
}