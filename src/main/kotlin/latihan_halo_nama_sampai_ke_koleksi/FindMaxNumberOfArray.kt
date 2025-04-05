package com.dicodingdelfi.kotlin.latihan_halo_nama_sampai_ke_koleksi

/*
* Buatlah sebuah fungsi yang dapat menemukan angka terbesar dari sebuah array.
* Contoh: Jika array yang diberikan adalah [1, 5, 3, 7, 2], maka hasilnya adalah 7.*/

fun main() {
    val array = arrayOf(1, 5, 3, 7, 2)
    println("The Max Number of the Array is: ${array.maxOrNull()}")

    /*Perbaikan oleh AI*/
    val array2 = array.clone() // Membuat salinan array pertama untuk "perbandingan" tanpa mengubah array asli. Ctt: penggunaan .clone tidak disarankan digunakan secara luas terlebih jika ukuran array nya besar karena hal ini akan menumbulkan overhead.
    if (array2.isEmpty()) {
        println("Array is empty. Unable to find the maximum number.")
    } else {
        println("The Max Number of the Array is: ${array2.maxOrNull()}")
    }
}

// Komentar dari AI Copilot
/*
* Jawaban Anda sudah benar dan berfungsi untuk menemukan angka terbesar dari sebuah array.
* Penggunaan fungsi bawaan  adalah cara yang tepat dan efisien dalam Kotlin untuk mendapatkan nilai maksimum.
* Namun, ada beberapa hal yang bisa ditambahkan atau ditingkatkan:
*
* 1. Penanganan Array Kosong
* -  maxOrNull() akan mengembalikan null jika array kosong. Untuk menangani ini, Anda dapat memberikan pesan
*    khusus jika array tidak memiliki elemen.
* 2. Lebih Kontekstual:
* -  Anda bisa menambahkan pengecekan kondisi untuk memberikan hasil yang lebih informatif kepada pengguna.
* */