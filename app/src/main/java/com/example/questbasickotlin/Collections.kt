package com.example.questbasickotlin

fun ContohList(){
    println("=== List ===")
    val readOnlyAbjad = listOF("A", "B", "C")
    println(readOnlyAbjad)

    val shape: MutableList<String> = mutableListOf("Circle", "Square", "Triangle")
    println(shape)

    shape.add("Circle")
    println(shape)

    shape.remove("Triangle")
    println(shape)

    shape[0] = "Oval"
    println(shape)

    val shapesLocked: List<String> = shape
    println(shapesLocked)
}
