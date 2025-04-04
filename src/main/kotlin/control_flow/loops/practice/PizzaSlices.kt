package com.dicodingdelfi.kotlin.control_flow.loops.practice

fun main() {
    var pizzaSlices = 0
    // Using while loop
    while (pizzaSlices < 7) {
        pizzaSlices++
        println("There's only $pizzaSlices slice/s of pizza :(")
    }
    pizzaSlices++
    println("There are $pizzaSlices slices of pizza. Hooray! We have a whole pizza! :D")
}