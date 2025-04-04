package com.dicodingdelfi.kotlin.control_flow.loops.practice

fun main() {
    val words = listOf<String>("dinosaur", "limousine", "magazine", "language")
    for (w in words) {
        if (w.startsWith("l"))
            println(w)
    }
}