package com.dicodingdelfi.kotlin.lambda_expression.practice

fun repeatN(n: Int, action: () -> Unit) {
    for (i in 1..n){
        action()
    }
}

fun main() {
    repeatN(5) {
        println("Hello")
    }
}