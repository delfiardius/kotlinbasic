package com.dicodingdelfi.kotlin.latihan_halo_nama_sampai_ke_koleksi

/*
* Soal
*
* Buat sebuah fungsi yang menerima sebuah  dari pengguna dan mencetak hasilnya dalam bentuk terbalik. Contoh:
* Input: "Kotlin"
* Output: "niltok"*/

fun main() {
    /*Komentar
    *
    * Kode ini sudah bekerja dengan baik untuk membalik string. Namun, berikut adalah beberapa saran kecil:
    * 1. Hindari menggunakan .toString() untuk nilai yang sudah berupa string (readLine() menghasilkan string atau null).
    * 2. Tambahkan validasi untuk menangani input kosong.
    * */

    println("====Program Balik String====\n")

    print("Input Kata: ")

    // Sebelumnya
    /*val input = readLine()
    val kataYangAkanBalik = input.toString()*/

    // Perbaikan
    val input = readLine()?.trim() // Menghapus spasi extra
    if (!input.isNullOrEmpty()) {
        balikString(input)
    } else {
        println("Input tidak boleh kosong!")
    }

    println("\n====Program Berakhir====")
}

fun balikString(message: String) {
    val balikInput = message.reversed()
    println("\nInput: $message")
    println("Output: $balikInput")
}