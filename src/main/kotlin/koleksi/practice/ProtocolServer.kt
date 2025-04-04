package com.dicodingdelfi.kotlin.koleksi.practice

fun main() {
    val SUPPORTED = listOf("HTTP", "HTTPS", "FTP")
    val requested = "smtp"
    val isSupported = requested.uppercase() in SUPPORTED // cek the request in a list, if yes, the result request is true, is no then false
    println("Support for $requested: $isSupported") // requested false
}