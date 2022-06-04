package br.com.zup.tabuada

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import br.com.zup.tabuada.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding
    private lateinit var numeroDigitado: String

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btnCalcular.setOnClickListener {
            enviarNumero()
            limparCampo()
        }
    }

    private fun enviarNumero(){
        recuperarNumerodigitado()
        if (!verificarCampo()) {
            val intent = Intent(this, TelaDeResultado::class.java).apply {
                putExtra("Numero", numeroDigitado)
            }
            startActivity(intent)
        }
    }

    private fun recuperarNumerodigitado(){
        this.numeroDigitado = binding.etValorTabuada.text.toString()
    }

    private fun limparCampo(){
        binding.etValorTabuada.text.clear()
    }

    private fun verificarCampo(): Boolean {
        return if (numeroDigitado.isEmpty()) {
            Toast.makeText(this, R.string.MSG_PREENCHER_VALORES, Toast.LENGTH_LONG).show()
            true
        } else {
            false
        }
    }



// ok   TODO criar fun para recuperar numero digitado
// ok   TODO criar fun para enviar numero
//    TODO criar validação de dados
//    TODO limpar dados
}