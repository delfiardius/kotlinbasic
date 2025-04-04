package com.dicodingdelfi.kotlin.latihan_halo_nama_sampai_ke_koleksi

/*
* Soal
*
* Buat sebuah  berisi nama-nama temanmu. Cetak semua nama tersebut.
* Dari daftar  tersebut, buat sebuah  untuk memastikan tidak ada nama yang duplikat, lalu cetak hasilnya.
* Simpan nama-nama tersebut dalam sebuah  dengan kunci berupa angka urut (misalnya, 1 untuk nama pertama, 2 untuk nama kedua, dst.).*/

fun main() {
    /*
    * Komentar:
    * Kode ini berfungsi dengan baik, tetapi ada duplikasi data di Set dan Map.
    * Set otomatis menghilangkan duplikasi, jadi kamu tidak perlu menambahkan elemen yang sama beberapa kali.
    * Untuk meningkatkan efisiensi, lakukan perbaikan*/

    // Data awal
    val namaTeman: List<String> = listOf(
        "Delfi", "Ardi", "Gulo", "Darling", "Gulo", "Jurlinus", "Gulo", "Hendrik", "Susanto", "Telaumbanua", "Jaya", "Telaumbanua", "Jefri", "Gea"
    )
    // Sebelumnya
    /*val temanTeman: Set<String> = setOf(
        "Delfi", "Ardi", "Gulo", "Darling", "Gulo", "Jurlinus", "Gulo", "Hendrik", "Susanto", "Telaumbanua", "Jaya", "Telaumbanua", "Jefri", "Gea"
    )*/
    // Perbaikan
    val temanTeman: Set<String> = namaTeman.toSet()

    // Sebelumnya
    /*val urutanNamaTeman: Map<Int, String> = mapOf(
        1 to "Delfi", 2 to "Ardi", 3 to "Gulo", 4 to "Darling", 5 to "Gulo",
        6 to "Jurlinus", 7 to "Gulo", 8 to "Hendrik", 9 to "Susanto", 10 to "Telaumbanua",
        11 to "Jaya", 12 to "Telaumbanua", 13 to "Jefri", 14 to "Gea"
    )*/
    // Perbaikan
    val urutanNamaTeman: Map<Int, String> = namaTeman.distinct().mapIndexed { index, name -> index + 1 to name }.toMap()

    println("Saya mempunyai teman sebanyak ${namaTeman.count()}")
    println("Daftar nama teman saya: ")
    println(namaTeman)
    println(temanTeman)
    println("Urutan Nama Teman Saya: ")
    println(urutanNamaTeman)
}