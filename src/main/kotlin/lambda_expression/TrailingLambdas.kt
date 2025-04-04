package com.dicodingdelfi.kotlin.lambda_expression

fun main() {
    // The initial value is zero
    // The operation sums the initial value with every item in the list cumulatively
    println(listOf<Int>(1,2,3).fold(0, {x, item -> x + item }) )

    // alternatively, in the form of a trailing lambda
    println(listOf<Int>(1,2,3).fold(0) {x, item -> x + item})
}