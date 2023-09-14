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
        val button0: Button = findViewById(R.id.button0)
        val button1: Button = findViewById(R.id.button1)
        val button2: Button = findViewById(R.id.button2)
        val button3: Button = findViewById(R.id.button3)
        val button4: Button = findViewById(R.id.button4)
        val button5: Button = findViewById(R.id.button5)
        val button6: Button = findViewById(R.id.button6)
        val button7: Button = findViewById(R.id.button7)
        val button8: Button = findViewById(R.id.button8)
        val button9: Button = findViewById(R.id.button9)
        val buttonShare: Button = findViewById(R.id.share)
        val buttonAC: Button = findViewById(R.id.ac)
        val buttonDivide: Button = findViewById(R.id.divide)
        val buttonMultiply: Button = findViewById(R.id.multiply)
        val buttonMinus: Button = findViewById(R.id.minus)
        val buttonPlus: Button = findViewById(R.id.sum)
        val buttonDot: Button = findViewById(R.id.dot)
        val text: TextView = findViewById(R.id.number)

        button0.setOnClickListener {
            pantalla = button0.text.toString()
            text.text = pantalla
        }
        button1.setOnClickListener {
            pantalla = button1.text.toString()
            text.text = pantalla
        }
        button2.setOnClickListener {
            pantalla = button2.text.toString()
            text.text = pantalla
        }
        button3.setOnClickListener {
            pantalla = button3.text.toString()
            text.text = pantalla
        }
        button4.setOnClickListener {
            pantalla = button4.text.toString()
            text.text = pantalla
        }
        button5.setOnClickListener {
            pantalla = button5.text.toString()
            text.text = pantalla
        }
        button6.setOnClickListener {
            pantalla= button6.text.toString()
            text.text = pantalla
        }
        button7.setOnClickListener {
            pantalla = button7.text.toString()
            text.text = pantalla
        }
        button8.setOnClickListener {
            pantalla = button8.text.toString()
            text.text = pantalla
        }
        button9.setOnClickListener {
            pantalla= button9.text.toString()
            text.text = pantalla

        }
        buttonAC.setOnClickListener {
            pantalla = ""
            text.text=pantalla
        }
        buttonDivide.setOnClickListener {
            pantalla= buttonDivide.text.toString()
            text.text = pantalla
        }
        buttonMultiply.setOnClickListener {
            pantalla = buttonMultiply.text.toString()
            text.text = pantalla
        }
        buttonPlus.setOnClickListener {
            pantalla = buttonPlus.text.toString()
            text.text = pantalla
        }
        buttonMinus.setOnClickListener {
            pantalla = buttonMinus.text.toString()
            text.text = pantalla
        }
        buttonDot.setOnClickListener {
            pantalla= buttonDot.text.toString()
            text.text = pantalla
        }
        buttonShare.setOnClickListener {
            pantalla = getString(R.string.compartido)
            text.text = pantalla
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