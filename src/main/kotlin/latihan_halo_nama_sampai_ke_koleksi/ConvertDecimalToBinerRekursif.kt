package com.dicodingdelfi.kotlin.latihan_halo_nama_sampai_ke_koleksi

fun decimalToBinary(decimal: Int): String {
    // Basis rekursif: jika desimal adalah 0, kembalikan string kosong
    if (decimal == 0) return ""

    // Rekursi: bagi desimal dengan 2 dan tambahkan hasil bagi secara rekursif
    return decimalToBinary(decimal / 2) + (decimal % 2).toString()
}

fun main() {
    val decimalNumber = 2
    val binaryRepresentation = decimalToBinary(decimalNumber)

    // Jika input adalah 0, hasilnya harus langsung 0
    println("Bilangan desimal $decimalNumber dalam bilangan biner adalah ${if (decimalNumber == 0) "0" else binaryRepresentation}")
}