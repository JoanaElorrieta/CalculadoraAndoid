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

        findViewById<Button>(R.id.button0).setOnClickListener {
            pantalla += findViewById<Button>(R.id.button0).text.toString()
            findViewById<TextView>(R.id.number).text = pantalla
        }
        findViewById<Button>(R.id.button1).setOnClickListener {
            pantalla += findViewById<Button>(R.id.button1).text.toString()
            findViewById<TextView>(R.id.number).text = pantalla
        }
        findViewById<Button>(R.id.button2).setOnClickListener {
            pantalla += findViewById<Button>(R.id.button2).text.toString()
            findViewById<TextView>(R.id.number).text = pantalla
        }
        findViewById<Button>(R.id.button3).setOnClickListener {
            pantalla += findViewById<Button>(R.id.button3).text.toString()
            findViewById<TextView>(R.id.number).text = pantalla
        }
        findViewById<Button>(R.id.button4).setOnClickListener {
            pantalla += findViewById<Button>(R.id.button4).text.toString()
            findViewById<TextView>(R.id.number).text = pantalla
        }
        findViewById<Button>(R.id.button5).setOnClickListener {
            pantalla +=  findViewById<Button>(R.id.button5).text.toString()
            findViewById<TextView>(R.id.number).text = pantalla
        }
        findViewById<Button>(R.id.button6).setOnClickListener {
            pantalla += findViewById<Button>(R.id.button6).text.toString()
            findViewById<TextView>(R.id.number).text = pantalla
        }
        findViewById<Button>(R.id.button7).setOnClickListener {
            pantalla += findViewById<Button>(R.id.button7).text.toString()
            findViewById<TextView>(R.id.number).text = pantalla
        }
        findViewById<Button>(R.id.button8).setOnClickListener {
            pantalla += findViewById<Button>(R.id.button8).text.toString()
            findViewById<TextView>(R.id.number).text = pantalla
        }
        findViewById<Button>(R.id.button9).setOnClickListener {
            pantalla += findViewById<Button>(R.id.button9).text.toString()
            findViewById<TextView>(R.id.number).text = pantalla
        }
        findViewById<Button>(R.id.ac).setOnClickListener {
            findViewById<TextView>(R.id.number).text="0"
            pantalla=""
        }
        findViewById<Button>(R.id.equals).setOnClickListener {
            findViewById<TextView>(R.id.number).text="0"
            pantalla=""
        }
        findViewById<Button>(R.id.divide).setOnClickListener {
            pantalla= findViewById<Button>(R.id.divide).text.toString()
            findViewById<TextView>(R.id.number).text = pantalla
            pantalla=""
        }
        findViewById<Button>(R.id.multiply).setOnClickListener {
            pantalla = findViewById<Button>(R.id.multiply).text.toString()
            findViewById<TextView>(R.id.number).text = pantalla
            pantalla=""
        }
        findViewById<Button>(R.id.sum).setOnClickListener {
            pantalla = findViewById<Button>(R.id.sum).text.toString()
            findViewById<TextView>(R.id.number).text = pantalla
            pantalla=""
        }
        findViewById<Button>(R.id.minus).setOnClickListener {
            pantalla = findViewById<Button>(R.id.minus).text.toString()
            findViewById<TextView>(R.id.number).text = pantalla
            pantalla=""
        }
        findViewById<Button>(R.id.dot).setOnClickListener {
            pantalla += findViewById<Button>(R.id.dot).text.toString()
            findViewById<TextView>(R.id.number).text = pantalla
        }
        findViewById<Button>(R.id.share).setOnClickListener {
            pantalla = getString(R.string.compartido)
            findViewById<TextView>(R.id.number).text = pantalla
            pantalla=""
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