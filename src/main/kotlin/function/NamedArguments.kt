package com.dicodingdelfi.kotlin.function


fun main() {
    fun printMessageWithPrefix(message: String, prefix: String) {
        println("[$prefix] $message")
    }

    printMessageWithPrefix(prefix = "Log", message = "Hello")
}