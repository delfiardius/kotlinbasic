package com.dicodingdelfi.kotlin.function

fun main() {
    fun printMessageWithPrefix(message: String, prefix: String = "Info") {
        println("[$prefix] $message")
    }

    // function called with bot parameters
    printMessageWithPrefix("Hello", "Log")

    // function called only with message parameter
    printMessageWithPrefix("Hello")

    printMessageWithPrefix(prefix = "Log", message = "Hello")
}