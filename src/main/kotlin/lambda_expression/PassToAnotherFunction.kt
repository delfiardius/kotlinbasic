package com.dicodingdelfi.kotlin.lambda_expression

fun main() {
    val numbers = listOf<Int>(1, -2, 3, -4, 5, -6)
    val positives = numbers.filter { x -> x > 0 }
    val isNegative = {x: Int -> x < 0}
    val negatives = numbers.filter(isNegative)
    println(positives)
    println(negatives)
}