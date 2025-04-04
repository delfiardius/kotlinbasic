package com.dicodingdelfi.kotlin.latihan_halo_nama_sampai_ke_koleksi

/*
* Soal
*
* Buat sebuah fungsi yang menerima  berisi angka-angka. Temukan dan cetak angka terbesar dalam daftar tersebut.*/

fun main() {
    val koleksiAngka: List<Int> = listOf(1, 2, 3, 4, 6, 3, 5, 3, 12, 11, 18, 34, 4, 6)

    /*
    * Komentar: Metode .min() dan .max() sudah usang dan digantikan dengan .minOrNull() dan .maxOrNull()*/
    println("Angka terkecil dari daftar tersebut adalah ${koleksiAngka.minOrNull()}")
    println("Angka terbesar dari daftar tersebut adalah ${koleksiAngka.maxOrNull()}")
}