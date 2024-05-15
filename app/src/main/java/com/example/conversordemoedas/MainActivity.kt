package com.example.conversordemoedas

import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.example.conversordemoedas.databinding.ActivityMainBinding


class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val editText = binding.etValorNota
        val txt60 = binding.tv60
        val txt40 = binding.tv40
        val txt5 = binding.tv5
        val txt15 = binding.tv15
        val btCalcular = binding.btCalcular

        btCalcular.setOnClickListener {

            val valorDaNota = editText.text.toString()
           calcularImposto(valorDaNota, txt60, txt40, txt5, txt15 )
        }
    }

    private fun calcularImposto(text: String, txt60: TextView, txt40: TextView, txt5: TextView, txt15: TextView){

        if(text.isNotEmpty()){

        val valor = text.toInt()

            txt60.text = (valor * 0.60).toString()
            txt40.text = (valor * 0.40).toString()
            txt5.text = (valor * 0.60 * 0.05).toString()
            txt15.text = (valor * 0.015).toString()



        } else {
            Toast.makeText(this,"Digite um valor",Toast.LENGTH_LONG).show()
        }


    }
}