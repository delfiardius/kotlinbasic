package com.dicodingdelfi.kotlin.latihan_halo_nama_sampai_ke_koleksi

/*
* Soal
*
* Tulis program yang meminta pengguna memasukkan sebuah angka desimal (contoh: 3.14). Konversikan angka tersebut menjadi integer, lalu cetak hasilnya dalam format:
* Angka desimal [angka] telah dikonversikan menjadi [angka integer].
* */
fun main() {
    // Sebelumnya
    inputAngkaDesimal(4.15)

    /*Saran: Tambahkan validasi input dari pengguna untuk menghindari crash:*/
    println("Masukkan angka Desimal: ")
    val input = readLine()
    val angka = input?.toDoubleOrNull()

    if (angka != null) inputAngkaDesimal(angka = angka) else {
        println("Input Tidak Valid")
    }

}

fun inputAngkaDesimal(angka: Double) {
    val angkaToInt = angka.toInt()
    println("Angka desimal $angka telah dikonversi menjadi $angkaToInt")
}