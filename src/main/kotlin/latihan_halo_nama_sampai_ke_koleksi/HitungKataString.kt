package com.dicodingdelfi.kotlin.latihan_halo_nama_sampai_ke_koleksi

/*
* Buatlah sebuah fungsi yang dapat menghitung jumlah kata dalam sebuah kalimat.
* Contoh: Jika kalimat yang diberikan adalah “Halo, nama saya John Doe”, maka hasilnya adalah 5.
* */

fun main() {
    println("===Program Hitung Kata Berdasarkan Kalimat yang Diberikan===")
    print("Input kalimat Anda: ")
    val input = readLine()?.split(' ')
    println("Jumlah Kata dalam Kalimat yang Anda Inputkan adalah: ${input?.count()}")
}