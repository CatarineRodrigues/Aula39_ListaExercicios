package br.com.zup.caixasupermercado.main

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import br.com.zup.caixasupermercado.constants.MSG_PREENCHER_VALORES
import br.com.zup.caixasupermercado.constants.PRODUTO
import br.com.zup.caixasupermercado.databinding.ActivityMainBinding
import br.com.zup.caixasupermercado.model.Produto

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
        if(!verificarCampos()) {
            val produto = Produto(
                qntProduto.toInt(),
                valorProduto.toDouble()
            )

            val intent = Intent(this, DetalheCompra::class.java).apply {
                putExtra(PRODUTO, produto)
            }
            startActivity(intent)
            limparCampos()
        }
    }

    private fun recuperarDadosDigitados() {
        this.nomeProduto = binding.etNomeProduto.text.toString()
        this.qntProduto = binding.etQtdProduto.text.toString()
        this.valorProduto = binding.etValorUnitario.text.toString()
    }

    private fun limparCampos() {
        binding.etQtdProduto.text.clear()
        binding.etQtdProduto.text.clear()
        binding.etValorUnitario.text.clear()
    }

    private fun verificarCampos(): Boolean {
        return if (qntProduto.isEmpty() && valorProduto.isEmpty()) {
            Toast.makeText(this, MSG_PREENCHER_VALORES, Toast.LENGTH_LONG).show()
            true
        } else {
            false
        }
    }
}