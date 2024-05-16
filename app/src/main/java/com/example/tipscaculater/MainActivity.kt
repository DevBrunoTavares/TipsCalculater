package com.example.tipscaculater

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import com.example.tipscaculater.databinding.ActivityMainBinding
import com.google.android.material.snackbar.Snackbar
import com.google.android.material.textfield.TextInputEditText

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        var porcentagem: Int = 0

        binding.rbOpcaoUm.setOnCheckedChangeListener { _, isChecked ->
            if (isChecked) {
                porcentagem = 5
            }
        }

        binding.rbOpcaoDois.setOnCheckedChangeListener { _, isChecked ->
            if (isChecked) {
                porcentagem = 10
            }
        }

        binding.rbOpcaoTres.setOnCheckedChangeListener { _, isChecked ->
            if (isChecked) {
                porcentagem = 15
            }
        }

        binding.rbOpcaoQuatro.setOnCheckedChangeListener { _, isChecked ->
            if (isChecked) {
                porcentagem = 20
            }
        }

        binding.rbOpcaoCinco.setOnCheckedChangeListener { _, isChecked ->
            if (isChecked) {
                porcentagem = 25
            }
        }

        binding.rbOpcaoSeis.setOnCheckedChangeListener { _, isChecked ->
            if (isChecked) {
                porcentagem = 50
            }
        }

        binding.btnLimpar.setOnClickListener {

        }

        binding.btnCalcular.setOnClickListener {
            val totalMesaTemp = binding.tieTotal.text
            val nPeossasTemp =  binding.tiePessoas.text

            if (totalMesaTemp?.isEmpty() == true ||
                nPeossasTemp?.isEmpty() == true
                ){
                    Snackbar.make(binding.tieTotal, "Preencha todos os campos", Snackbar.LENGTH_LONG).show()
            }else {

                val totalMesa: Float = totalMesaTemp.toString().toFloat()
                val nPessoas: Int = nPeossasTemp.toString().toInt()

                val totalDividido = totalMesa / nPessoas
                val tips = totalDividido * porcentagem / 100
                val totalComTips = totalDividido + tips
                binding.tvResultado.text = "R$:$totalComTips"
            }
            binding.btnLimpar.setOnClickListener{
                binding.tvResultado.text = ""
                binding.tieTotal.setText("")
                binding.tiePessoas.setText("")
                binding.rbOpcaoUm.isChecked = false
                binding.rbOpcaoDois.isChecked = false
                binding.rbOpcaoTres.isChecked = false
                binding.rbOpcaoQuatro.isChecked = false
                binding.rbOpcaoCinco.isChecked = false
                binding.rbOpcaoSeis.isChecked = false

            }
        }
    }
}