package com.carlos.firstapp

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class MostrarResultado : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_mostrar_resultado)

        val valor = intent.extras["valorCalculado"] as Double

        val mostrarResultado = findViewById<TextView>(R.id.text);
        mostrarResultado.text = valor.toString()
    }
}
