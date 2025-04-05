package com.dicodingdelfi.kotlin.latihan_halo_nama_sampai_ke_koleksi

fun mostFrequentChar(word: String): Char? {
    if (word.isEmpty()) return null // Penanganan untuk input kosong

    // Membuat map untuk menghitung frekuensi tiap huruf
    val frequencyMap = word.groupingBy { it }.eachCount()

    // Menemukan huruf dengan frekuensi tertinggi
    return frequencyMap.maxByOrNull { it.value }?.key
}

fun main() {
    val word = "hello"
    val result = mostFrequentChar(word)
    if (result != null) {
        println("Huruf yang paling sering muncul dalam kata \"$word\" adalah huruf \"$result\"")
    } else {
        println("Kata yang diberikan kosong.")
    }
}