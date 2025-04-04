package com.dicodingdelfi.kotlin.koleksi.practice

fun main() {
    val number2word = mapOf<Int, String>(1 to "One", 2 to "Two", 3 to "Three")
    val n = 2
    println("$n is spelt as '${number2word[n]}'")
}