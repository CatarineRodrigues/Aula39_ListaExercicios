package br.com.zup.tabuada

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import br.com.zup.tabuada.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }

//    TODO criar fun para recuperar numero digitado
//    TODO criar fun para enviar numero
//    TODO criar validação de dados
//    TODO limpar dados
}