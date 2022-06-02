package br.com.zup.caixasupermercado.main

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.MenuItem
import br.com.zup.caixasupermercado.R
import br.com.zup.caixasupermercado.databinding.ActivityDetalheCompraBinding

class DetalheCompra : AppCompatActivity() {
    private lateinit var binding: ActivityDetalheCompraBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityDetalheCompraBinding.inflate(layoutInflater)
        setContentView(binding.root)

        supportActionBar?.setDisplayHomeAsUpEnabled(true)
        supportActionBar?.title = getString(R.string.titulo_detalhes_compra)

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
        binding.tvTotalCompra.text = "O VALOR TOTAL É DE: R$ $valor"
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        if (item.itemId == android.R.id.home) {
            this.finish()
            return true
        }
        return super.onOptionsItemSelected(item)
    }
}