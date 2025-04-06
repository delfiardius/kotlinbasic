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
    val input = readLine()?.toIntOrNull()
    if (input != null) {
        if (isPrime(input)) {
            println("$input adalah bilangan prima")
        } else {
            println("$input bukan bilangan prima")
        }
    } else {
        println("Input harus berupa bilangan bulat positif")
    }

    println("\n====Program Berakhir====")
}

fun isPrime(bilangan: Int): Boolean {
    if (bilangan < 2) return false // Bilangan kurang dari 2 bukan bilangan prima
    for (i in 2 until bilangan) { // Loop dari 2 hingga n-1
        if (bilangan % i == 0) return false // Jika habis dibagi selain 1 dan dirinya sendiri
    }
    return true // Jika tidak ada pembagi, maka bilangan adalah bilangan prima
}

/*
fun inputBilangan(bilangan: Double?) {
    if (bilangan != null) {
        when {
            (bilangan % 1).toInt() == 0 && (bilangan.toInt() != 1) -> {
                println("$bilangan Inputan Anda adalah bilangan prima")
            }
            (bilangan % bilangan).toInt() == 0 && (bilangan.toInt() != 1) -> {
                println("$bilangan Inputan Anda adalah bilangan prima")
            }
            else -> println("$bilangan Inputan Anda bukan bilangan prima")
        }
    } else {
        println("Inputan harus berupa angka")
    }
}*/
