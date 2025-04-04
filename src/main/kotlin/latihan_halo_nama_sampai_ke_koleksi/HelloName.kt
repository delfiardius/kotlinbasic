package com.dicodingdelfi.kotlin.latihan_halo_nama_sampai_ke_koleksi

/*
* Soal
*
* Buat sebuah program yang mencetak "Hello, [nama]" di layar, di mana  adalah nama yang diambil dari input pengguna.
* */


fun main() {
    // Sebelumnya
    inputYourName("Ardi") /*Kurang interaktif*/

    /*Perbaikan
    * Saran: Tambahkan fitur input dari pengguna agar lebih interaktif:*/
    println("Input Your Name: ")
    val name = readLine()
    inputYourName(name ?: "Unknown")
}

fun inputYourName(name: String){
    println("Hello $name")
}