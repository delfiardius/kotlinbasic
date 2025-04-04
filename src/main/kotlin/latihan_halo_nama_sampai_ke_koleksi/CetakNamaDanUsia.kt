package com.dicodingdelfi.kotlin.latihan_halo_nama_sampai_ke_koleksi

/*
* Soal
* Buat sebuah fungsi yang menerima nama pengguna dan tahun lahir. Gunakan string template untuk mencetak:
* Halo, [nama]! Usia kamu di tahun ini adalah [usia].
*/

fun main() {
    println("===Program Cetak Nama dan Usia===\n")

    print("Inputkan Namamu: ")
    val nama = readLine()?.trim() ?: "Tanpa Nama" //.trim() digunakan Untuk memastikan input nama tidak mengandung spasi ekstra di awal atau akhir.

    print("Input Usiamu: ")
    val input = readLine()
    val usia = input?.toIntOrNull()

    if (usia != null) {
        if (usia <= 0) {
            println("$nama, Usia harus lebih dari 0 dan harus berupa angka positif")
        } else {
            println("Halo, $nama! Usia kamu di tahun ini adalah $usia tahun")
        }
    } else {
        println("Input usia tidak valid $nama!, Masukkan angka positif!")
    }

    println("\n===Program Berakhir===")
}