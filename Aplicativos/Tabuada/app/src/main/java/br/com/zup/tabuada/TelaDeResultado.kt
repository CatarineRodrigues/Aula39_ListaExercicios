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

    }
//    TODO criar fun para recuperar numero digitado
//    TODO criar fun para enviar clic botão

}