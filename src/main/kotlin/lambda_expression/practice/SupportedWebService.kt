package com.dicodingdelfi.kotlin.lambda_expression.practice

fun main() {
    val actions = listOf<String>("title", "year", "author")
    val prefix = "https://example.com/book-info"
    val id = 5
    val urls = actions.map { actions -> "$prefix/$id/$actions" }
    println(urls)
}