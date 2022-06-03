package br.com.zup.tabuada

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import br.com.zup.tabuada.databinding.ActivityTelaDeResultadoBinding

class TelaDeResultado : AppCompatActivity() {

    private lateinit var binding: ActivityTelaDeResultadoBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityTelaDeResultadoBinding.inflate(layoutInflater)
        setContentView(binding.root)
        recuperarNumeroEnviado()

    }

    private fun recuperarNumeroEnviado(){
        val numero = intent.getStringExtra("Numero")
        if (numero != null) {
            calcularTabuada(numero.toInt())
            exibirTabuada(numero.toInt())
        }

    }

    private fun calcularTabuada(numeroTabuada: Int):Int {
        var resultado = 0
        for (i in 0..10) {
            resultado = numeroTabuada * i
        }
        return resultado
    }

    private fun exibirTabuada(numero: Int) {
        for (i in 0..10){
            binding.tvCalculoTabuada.text = "$numero x $i = ${numero*i}"
        }

    }


//    TODO criar fun para recuperar numero digitado
    // TODO função calcular tabuada
//    TODO criar fun para enviar clic botão

}