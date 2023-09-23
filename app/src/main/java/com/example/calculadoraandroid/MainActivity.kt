package com.example.calculadoraandroid

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    private var pantalla:String=""
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val numericButtonIds = listOf(
            R.id.button1, R.id.button2, R.id.button3,
            R.id.button4, R.id.button5, R.id.button6, R.id.button7,
            R.id.button8, R.id.button9
        )
        val showOnceButtonIds = listOf(
            R.id.button0, R.id.ac, R.id.equals
        )

        val operationButtonIds = listOf(
            R.id.divide, R.id.multiply, R.id.sum, R.id.minus, R.id.dot, R.id.share
        )

        for (buttonId in numericButtonIds) {
            findViewById<Button>(buttonId).setOnClickListener {
                pantalla += findViewById<Button>(buttonId).text.toString()
                findViewById<TextView>(R.id.number).text = pantalla
            }
        }
        for (buttonId in showOnceButtonIds) {
            findViewById<Button>(buttonId).setOnClickListener {
                findViewById<TextView>(R.id.number).text ="0"
                pantalla = ""
            }
        }

        for (buttonId in operationButtonIds) {
            findViewById<Button>(buttonId).setOnClickListener {
                pantalla = findViewById<Button>(buttonId).text.toString()
                findViewById<TextView>(R.id.number).text = pantalla
                pantalla = ""
            }
        }
    }

    override fun onResume() {
        super.onResume()
        val text: TextView = findViewById(R.id.number)
        text.text = pantalla
    }

    override fun onSaveInstanceState(outState: Bundle) {
        super.onSaveInstanceState(outState)
        outState.putString("pantalla",pantalla)
    }

    override fun onRestoreInstanceState(savedInstanceState: Bundle) {
        super.onRestoreInstanceState(savedInstanceState)
        pantalla=savedInstanceState.getString("pantalla","").toString()
    }
}