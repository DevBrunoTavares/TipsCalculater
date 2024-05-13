package com.example.tipscaculater

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import com.google.android.material.textfield.TextInputEditText

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btnLimpar: Button =  findViewById(R.id.btn_limpar)
        val btnCalcular: Button =  findViewById(R.id.btn_calcular)
        val edtTotal: TextInputEditText = findViewById(R.id.tie_total)
        val edtPessoas: TextInputEditText = findViewById(R.id.tie_pessoas)

        btnLimpar.setOnClickListener{
            println("Bruno1 " + edtTotal.text)
            println("Bruno1 " + edtPessoas.text)
        }
    }
}