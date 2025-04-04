package com.dicodingdelfi.kotlin.latihan_halo_nama_sampai_ke_koleksi

fun main() {
    print("Masukkan banyaknya bilangan: ")
    val input = readLine()?.toIntOrNull() // Menerima inputan dari user kemudian mengonversinya ke Int

    //Memeriksa apakah inputan beneran ada dan berupa angka positif
    if (input != null && input > 0) {
        val inputToList = (1..input).toList() // Menyimpan semua bilangan mulai dari 1 hingga batas inputan user kemudian mengonversikannya ke list.
        println("List Angka: ${inputToList.reversed()}") // Cetak list bilangan yang dibalik
    } else {
        println("Input tidak valid. Masukkan angkan positif!") // Statement yang akan dicetak apabila input tidak valid.
    }
}