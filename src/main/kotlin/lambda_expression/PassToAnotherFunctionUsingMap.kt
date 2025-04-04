package com.dicodingdelfi.kotlin.lambda_expression

fun main() {
    val numbers = listOf<Int>(1, -2, 3, -4, 5, -6)
    val doubled = numbers.map { x -> x * 2 }
    val isTripled = {x: Int -> x * 3}
    val tripled = numbers.map(isTripled)

    println(doubled)
    println(tripled)
}