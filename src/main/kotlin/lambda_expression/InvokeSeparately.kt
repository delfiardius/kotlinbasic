package com.dicodingdelfi.kotlin.lambda_expression

fun main() {
    println({text: String -> text.uppercase()} ("hello"))
}