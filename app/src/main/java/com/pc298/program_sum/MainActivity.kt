package com.pc298.program_sum

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val et1 = findViewById<EditText>(R.id.editTextNumber)
        val et2 = findViewById<EditText>(R.id.editTextNumber2)
        val btn1 = findViewById<Button>(R.id.button2)
        val tv1 = findViewById<TextView>(R.id.textView2)
        btn1.setOnClickListener{
            val num1 = et1.text.toString().toInt()
            val num2 = et2.text.toString().toInt()
            val sum = num1 + num2
            tv1.text = "Resultado: "+sum.toString()
        }
    }
}