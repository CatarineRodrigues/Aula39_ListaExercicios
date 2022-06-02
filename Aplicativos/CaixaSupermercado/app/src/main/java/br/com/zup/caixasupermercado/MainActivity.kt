package br.com.zup.caixasupermercado

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import br.com.zup.caixasupermercado.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding
//    private lateinit var nomeProduto: String
    private lateinit var qntProduto: String
    private lateinit var valorProduto: String

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
//        recuperarDadosDigitados()

        binding.btnCalcular.setOnClickListener {
            exibirDados()
        }
    }

    //recuperar os dados
    //levar pra outra tela
    private fun exibirDados(){
        val nomeProduto = binding.etNomeProduto.text.toString()
        Toast.makeText(this, nomeProduto ,Toast.LENGTH_LONG).show()
    }

//    private fun recuperarDadosDigitados(){
//        this.qntProduto = binding.etQtdProduto.text.toString()
//        this.valorProduto = binding.etValorUnitario.text.toString()
//
//    }



}