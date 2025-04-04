package com.dicodingdelfi.kotlin.lambda_expression

val upperCaseString: (String) -> String = {text -> text.uppercase()}

fun main() {
    println(upperCaseString("hello"))
}