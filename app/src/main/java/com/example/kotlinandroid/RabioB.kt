package com.example.kotlinandroid

import android.annotation.SuppressLint
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.RadioButton
import android.widget.Toast


import androidx.appcompat.app.AppCompatActivity
import androidx.core.os.bundleOf

class RabioB : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

       val radio1 = findViewById<RadioButton>(R.id.radio1)
        val radio2 = findViewById<RadioButton>(R.id.radio2)
        val radio3 = findViewById<RadioButton>(R.id.radio3)

        val edit1 = findViewById<EditText>(R.id.edit1)

        val btnCalcular = findViewById<Button>(R.id.btnCalcular)

         btnCalcular.setOnClickListener{
             var num = Integer.parseInt(edit1.text.toString())
             if(radio1.isSelected){

                 var seno =  Math.sin(num.toDouble())

                 Toast.makeText(this,"El seno es:${seno}", Toast.LENGTH_LONG).show()

             }else if (radio2.isSelected){

                 var coseno = Math.cos(num.toDouble())

                 Toast.makeText(this,"El coseno es:${coseno}", Toast.LENGTH_LONG).show()

             }else if (radio3.isSelected){

                 var raiz = Math.sqrt(num.toDouble())

                 Toast.makeText(this,"El coseno es:${raiz}", Toast.LENGTH_LONG).show()
             }

         }
    }
}