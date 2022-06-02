package br.com.zup.caixasupermercado.model

import android.os.Parcelable
import kotlinx.parcelize.Parcelize

@Parcelize
class Produto (private var quantidade: Int, private var valorUnitario: Double) : Parcelable {
    fun getQuantidade() = this.quantidade
    fun getValorUnitario() = this.valorUnitario

}