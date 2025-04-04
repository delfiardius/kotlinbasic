package com.dicodingdelfi.kotlin.latihan_halo_nama_sampai_ke_koleksi

/*
* Soal
*
* Tulis program untuk menghitung luas persegi panjang. Gunakan dua variabel  dan , kemudian cetak hasilnya dalam format:
*
* Luas persegi panjang dengan panjang [panjang] dan lebar [lebar] adalah [hasil].
* */

fun main() {
    println("====Program Hitung Luas Persegi Panjang====\n")
    print("Input panjang: ")
    val inputPanjang = readLine()
    val panjang = inputPanjang?.toDoubleOrNull()

    print("Input lebar: ")
    val inputLebar = readLine()
    val lebar = inputLebar?.toDoubleOrNull()
    // Tambahkan validasi

    if (panjang != null && lebar != null) {
        hitungLuasPersegiPanjang(panjang, lebar)
    } else {
        println("Input Tidak Valid! Pastikan panjang dan lebar adalah angka!")
    }
    println("\n====Program Berakhir====")
}

fun hitungLuasPersegiPanjang(
    panjang: Double,
    lebar: Double
){
    /*Perbaikan
    * Saran: Tambahkan validasi input untuk memastikan panjang dan lebar tidak negatif:*/
    if (panjang <= 0 || lebar <= 0) {
        println("Panjang dan Lebar harus lebih besar dari 0!")
        return
    }
    // Sebelumnya tanpa validasi
    val hasil = panjang * lebar
    println("Luas persegi panjang dengan panjang $panjang dan lebar $lebar adalah $hasil cm2")
}