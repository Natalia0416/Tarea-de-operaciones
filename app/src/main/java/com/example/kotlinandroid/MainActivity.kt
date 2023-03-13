 package com.example.kotlinandroid

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast

 class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        initEvents()

        val caja1 = findViewById<EditText>(R.id.caja1)
        val caja2 = findViewById<EditText>(R.id.caja2)
        val suma = findViewById<Button>(R.id.btnSuma)
        val resta = findViewById<Button>(R.id.btnResta)
        val mult = findViewById<Button>(R.id.btnMultiplicacion)
        val div = findViewById<Button>(R.id.btnDivision)

        suma.setOnClickListener(View.OnClickListener {
            var num1 = Integer.parseInt(caja1.text.toString())
            var num2 = Integer.parseInt(caja2.text.toString())
            var suma = num1 + num2

            Toast.makeText(this, "La suma de: ${num1} y ${num2} es: ${suma}", Toast.LENGTH_LONG)
                .show()
            caja1.setText("")
            caja2.setText("")
            caja1.requestFocus()
        })

        resta.setOnClickListener(View.OnClickListener {
            var num1 = Integer.parseInt(caja1.text.toString())
            var num2 = Integer.parseInt(caja2.text.toString())
            var resta = num1 - num2

            Toast.makeText(this, "La resta de: ${num1} y ${num2} es: ${resta}", Toast.LENGTH_LONG)
                .show()
            caja1.setText("")
            caja2.setText("")
            caja1.requestFocus()
        })

        mult.setOnClickListener(View.OnClickListener {
            var num1 = Integer.parseInt(caja1.text.toString())
            var num2 = Integer.parseInt(caja2.text.toString())
            var mult = num1 * num2

            Toast.makeText(
                this,
                "La multiplicacion de: ${num1} y ${num2} es: ${mult}",
                Toast.LENGTH_LONG
            ).show()
            caja1.setText("")
            caja2.setText("")
            caja1.requestFocus()
        })

        div.setOnClickListener(View.OnClickListener {
            var num1 = Integer.parseInt(caja1.text.toString())
            var num2 = Integer.parseInt(caja2.text.toString())
            var div = num1 / num2

            Toast.makeText(this, "La division de: ${num1} y ${num2} es: ${div}", Toast.LENGTH_LONG)
                .show()
            caja1.setText("")
            caja2.setText("")
            caja1.requestFocus()
        })


    }
     fun initEvents(){
         var boton = findViewById<Button>(R.id.btnSigue)

         boton.setOnClickListener {
             val intent = Intent(this, RabioB::class.java)
             startActivity(intent)
         }
     }
}