package com.dicodingdelfi.kotlin.latihan_halo_nama_sampai_ke_koleksi

/*
* Soal
* Tulis sebuah fungsi yang menerima sebuah bilangan dan menentukan apakah bilangan tersebut adalah bilangan prima. Cetak hasilnya dengan format:
* Bilangan [angka] adalah bilangan prima.
* atau
* Bilangan [angka] bukan bilangan prima.*/

fun main() {
    println("====Program Cek Bilangan Prima atau Bukan====\n")

    print("Input Angka: ")
    val input = readLine()
    val primaAtauBukan = input?.toDouble()
    inputBilangan(primaAtauBukan)

    println("\n====Program Berakhir====")
}

fun inputBilangan(bilangan: Double?) {
    if (bilangan != null) {
        when {
            bilangan < 1  -> {
                println("$bilangan bukan bilangan prima")
            }

            bilangan <= 3 -> {
                println("$bilangan adalah bilangan prima")
            }
        }
    } else {
        println("Inputan harus berupa angka")
    }
}