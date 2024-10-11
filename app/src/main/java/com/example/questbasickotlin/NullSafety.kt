package com.example.questbasickotlin

fun nullSafety(){
    var neverNull: String = "This cant be null"

    var nullable: String? = "You can keep a null here"

    nullable = null

    if (neverNull == null){
        println("inferredNoNull is null")
    }
    else{
        println("inferredNoNull is not null")
    }

    println(neverNull.length)
    println(nullable?.length)

    fun strLength(notNull: String): Int{
        return notNull.length
    }

    println(strLength(neverNull))
}
fun main(){
    nullSafety()
}