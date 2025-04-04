package com.dicodingdelfi.kotlin.control_flow.conditions

fun main() {
    val d: Int
    val check = true
    val a = 1
    val b = 2

    if (check) {
        d = 1
    } else {
        d = 2
    }

    println(d)

    // Using ternary operator
    println(if (a > b) a else b)
}

