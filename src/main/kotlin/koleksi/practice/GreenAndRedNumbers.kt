package com.dicodingdelfi.kotlin.koleksi.practice

fun main() {
    val greenNumbers = listOf(1, 3, 23)
    val redNumbers = listOf(17, 2)
    val totalCount = greenNumbers.count() + redNumbers.count()
    println(totalCount)
}