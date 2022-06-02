package br.com.zup.caixasupermercado.main

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import br.com.zup.caixasupermercado.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding
    private lateinit var nomeProduto: String
    private lateinit var qntProduto: String
    private lateinit var valorProduto: String

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)


        binding.btnCalcular.setOnClickListener {
            enviarDados()
        }
    }

    private fun enviarDados() {
        recuperarDadosDigitados()

        val produto = Produto(
            qntProduto.toInt(),
            valorProduto.toDouble()
        )

        val intent = Intent(this, DetalheCompra::class.java).apply {
            putExtra("Produto", produto)
        }
        startActivity(intent)
    }

    private fun recuperarDadosDigitados() {
        this.qntProduto = binding.etQtdProduto.text.toString()
        this.valorProduto = binding.etValorUnitario.text.toString()
    }
}