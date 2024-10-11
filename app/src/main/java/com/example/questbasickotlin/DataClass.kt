package com.example.questbasickotlin

//Data Class adalah class yang digunakan untuk menyimpan sebuah data
//Data Class menyediakan fungsi untuk mengoverride fungsi equals(), hashCode() dan toString()
//Data Class juga akan menyediakan fungsi copy() untuk membuat salinan objek dengan beberapa perubahan

data class DataClass(
    val id: Int,
    var email: String
)

fun main(){
    val data = DataClass(1, "Indra@gmail.com")
    println(data)

    val data2 = DataClass(1, "zachran@gmail.com")
    println(data == data2)

    val data3 = data.copy()
    println(data3)

    val data4 = data.copy(email = "sahar@gmail.com")
    println(data4)
}
