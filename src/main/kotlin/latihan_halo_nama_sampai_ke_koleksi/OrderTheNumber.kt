package com.dicodingdelfi.kotlin.latihan_halo_nama_sampai_ke_koleksi

/*Soal
* Buatlah sebuah fungsi untuk mengurutkan angka dalam sebuah array dari yang terkecil ke yang terbesar.
* Contoh: Jika array yang diberikan adalah [3, 1, 5, 2, 4], maka hasilnya adalah [1, 2, 3, 4, 5].*/

fun main() {
    val listNumber = listOf(3, 1, 5, 2, 4)
    if (listNumber.isEmpty()) {
        println("List can't be ordered if empty.")
    } else {
        println("The order of List: $listNumber is ${listNumber.sorted()}")
    }
    println("\nPerbedaan dengan Array")
    val arrayNumber = arrayOf(3, 1, 5, 2, 4)
    if (arrayNumber.isEmpty()) {
        println("Array can't be ordered if empty.")
    } else {
        println("The order of Array: $arrayNumber is ${arrayNumber.sorted()}")
        /* Kode di atas akan menghasilkan output berikut
        * The order of [Ljava.lang.Integer;@377dca04 is [1, 2, 3, 4, 5]*/

        /*Untuk memperbaikinya lakukan hal seperti berikut:*/
        println("\nThe order of Array: ${arrayNumber.contentToString()} is ${arrayNumber.sorted().joinToString(", ")}")
    }
}