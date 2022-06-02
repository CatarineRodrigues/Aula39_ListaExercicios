package br.com.zup.caixasupermercado.main

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import br.com.zup.caixasupermercado.databinding.ActivityDetalheCompraBinding

class DetalheCompra : AppCompatActivity() {
    private lateinit var binding: ActivityDetalheCompraBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityDetalheCompraBinding.inflate(layoutInflater)
        setContentView(binding.root)

        recuperarExibirDados()
    }

    private fun recuperarExibirDados(){
        val produto = intent.getParcelableExtra<Produto>("Produto")
        if (produto != null){
            val valorCompra = calcularTotalCompra(produto.getQuantidade(),produto.getValorUnitario())
            exibirTotalCompra(valorCompra)
        }
    }

    private fun calcularTotalCompra(qnt: Int, valor: Double) = qnt * valor

    private fun exibirTotalCompra(valor: Double){
//        "%.2".format(valor.toString())
        binding.tvTotalCompra.text = valor.toString()
    }
}