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

    /*Perbaikan oleh AI Copilot*/
    println("===Perbaikan oleh AI Copilot===")
    print("Input kalimat Anda: ")
    val inputKalimat = readLine()
    if (inputKalimat.isNullOrEmpty()) {
        println("Input tidak valid! Silakan masukan kalimat yang benar.")
    } else {
        val kata = inputKalimat.trim().split(Regex("\\s+"))
        println("Jumlah Kata dalam Kalimat yang Anda Inputkan adalah: ${kata.size}")
    }
}

// Komentar oleh AI Copilot
/*
* Kode Anda sudah cukup baik dan dapat berfungsi untuk menghitung jumlah kata dalam sebuah kalimat. Namun, ada beberapa hal yang bisa ditingkatkan:
* 1. Penanganan Input Null: Jika readLine() menghasilkan nilai null, maka .split('') akan memunculkan NPE.
*    Anda bisa menambahkan penanganann null.
* 2. Pemisahan kata: Pendekatan .split('') hanya memisahkan berdasarkan spasi tunggal. Jika terdapat beberapa
*    spasi berturut-turut atau karakter seperti tab (\t), maka mungkin hasilnya tidak akurat. AAnda dapat
*    menggunakan fungsi split(Regex("\\s+")) untuk memisahkan kata berdasarkan semua jenis spasi.*/

// Perbedaan count dan size
/*
* 1. .size:
*       - Merupakan properti bawaan dari koleksi sepereti List, Set, atau Array
*       - Karena properti, akses ke .size sangat cepat karena nilainya sudah tersedia tanpa perlu perhitungan ulang.
*       - Cocok digunakan saat Anda hanya ingin mengetahui jumlah elemen secara langsung.
* 2. .count()
*       - Merupakan fungsi yang dapat digunakan pada koleksi apa pun.
*       - Tanpa parameter, .count() mirip dengan .size karena menghitung seluruh elemen.
*       - Dengan parameter berupa lambda expression, .count() dapat digunakan untuk menghitung elemen yang
*         memenuhi kondisi tertentu. Contohnya
*   val numbers = listOf(1,2,3,4,5)
*   val evenCount = numbers.count { it % 2 }
*   println(evenCount)
* Ringkasan:
* - Gunakan .size jika Anda hanya ingin mengetahui jumlah elemen tanpa kondisi khusus.
* - Gunakan .count() jika Anda membutuhkan fleksibilitas untuk menghitung elemen berdasarkan kriteria tertentu.
* */