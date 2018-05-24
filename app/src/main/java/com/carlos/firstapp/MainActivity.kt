package com.carlos.firstapp

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.EditText
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    lateinit var entrada : EditText
    lateinit var entrada2: EditText


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        entrada = findViewById(R.id.input)
        entrada2 = findViewById(R.id.input2)
    }
    fun operacao(view : View) {
        var input = entrada.text.toString()
        var input2 = entrada2.text.toString()

        if (!input.isNullOrEmpty()&& !input2.isNullOrEmpty()) {
            if (view.id == R.id.soma) {
                somar(input, input2)
            } else if (view.id == R.id.sub) {
                subtrair(input, input2)
            } else if (view.id == R.id.mult) {
                multiplicar(input, input2)
            } else if (view.id == R.id.div) {
                dividir(input, input2)
            }
        } else {
            Toast.makeText(this, "digite os números", Toast.LENGTH_LONG).show()
        }
    }
    fun somar(input:String,input2:String){
        var adicionar = input.toDouble() + input2.toDouble()
//        Toast.makeText(this, "Teste" +input+input2, Toast.LENGTH_LONG).show()

        Toast.makeText(this,adicionar.toString(),Toast.LENGTH_LONG).show()
        val intent = Intent(this@MainActivity, MostrarResultado::class.java)
        intent.putExtra("valorCalculado", adicionar)
        startActivity(intent)
    }

    fun subtrair(input:String, input2:String){
        var diminuir = input.toDouble() - input2.toDouble()
        Toast.makeText(this,diminuir.toString(),Toast.LENGTH_LONG).show()
        val intent = Intent(this@MainActivity, MostrarResultado::class.java)
        intent.putExtra("valorCalculado", diminuir)
        startActivity(intent)

    }

    fun multiplicar(input: String, input2: String){
        var multi = input.toDouble() * input2.toDouble()
        Toast.makeText(this,multi.toString(),Toast.LENGTH_LONG).show()
        val intent = Intent(this@MainActivity, MostrarResultado::class.java)
        intent.putExtra("valorCalculado", multi)
        startActivity(intent)

    }

    fun dividir(input: String, input2: String){
        var dividir = input.toDouble() / input2.toDouble()
        Toast.makeText(this,dividir.toString(),Toast.LENGTH_LONG).show()
        val intent = Intent(this@MainActivity, MostrarResultado::class.java)
        intent.putExtra("valorCalculado", dividir)
        startActivity(intent)

    }
}
