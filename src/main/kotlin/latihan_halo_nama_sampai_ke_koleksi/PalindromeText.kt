package com.dicodingdelfi.kotlin.latihan_halo_nama_sampai_ke_koleksi

fun isPalindrome(text: String): Boolean {
    // Menghilangkan spasi dan mengubah semua huruf menjadi huruf kecil agar case-insensitive
    val cleanedText = text.replace(" ","").lowercase()

    // Membandingkan teks asli yang telah dibersihkan dengan versi terbaliknya
    return cleanedText == cleanedText.reversed()
}

fun main() {
    val input = "level"
    if (isPalindrome(input)) {
        println("Kata atau kalimat \"$input\" adalah palindrom.")
    } else {
        println("Kata atau kalimat \"$input\" bukan palindrom")
    }
}