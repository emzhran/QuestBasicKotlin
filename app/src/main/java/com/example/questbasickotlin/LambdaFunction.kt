package com.example.questbasickotlin

//Lambda Functions adalah fungsi yang tidak memiliki nama
//Lambda Functions biasanya digunakan untuk membuat fungsi yang sederhana
//Lambda Functions menggunakan tanda panah (->) untuk menyelesaikan parameter dan body fungsi

fun uppercaseString(string : String): String{
    return string.uppercase()
}

fun main(){
    uppercaseString("Hello")
    println({ string : String -> string.uppercase() }("Hello"))
}