package com.dicodingdelfi.kotlin.control_flow.loops

fun main() {
    for (number in 1..5) {
        print(number)
    }

    println("\n")
    println("Iterate a List")
    val cakes = listOf<String>("carrot", "cheese", "chocolate")
    for (cake in cakes){
        println("Yummy, it's a $cake cake!")
    }
}