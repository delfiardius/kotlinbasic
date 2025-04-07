package com.dicodingdelfi.kotlin.latihan_halo_nama_sampai_ke_koleksi

import java.util.Scanner

fun main() {
    /*val number = 56
    println("Prime factors of $number: ${getPrimeFactors(number)}")*/


    /*print("Input your number to get prime factorization: ")
    val input = readLine()?.toIntOrNull() // get user input

    // make sure the user input is not empty or null
    if (input != null) {
        if (isPrimeNumber(input)) {
            println("$input is prime number")
        } else {
            println("$input is not prime number")
        }
    } else {
        println("The input must be positive number")
    }*/

    val scanner = Scanner(System.`in`)

    print("Enter the total number of inputs: ")
    val total = scanner.nextLine().toIntOrNull() // Read the total number of inputs
    if (total == null || total <= 0) {
        println("Invalid input. Please enter a positive integer.")
        return
    }

    val numbers = mutableListOf<Int>()
    println("Enter $total numbers:")
    var i = 1
    while (i <= total) {
        print("Number $i: ")
        val input = scanner.nextLine().toIntOrNull()
        if (input == null || input <= 0) {
            println("Invalid input. Please enter a positive integer.")
            continue // Retry without incrementing 'i'
        }
        numbers.add(input)
        i++ // Increment only on valid input
    }

    println("\nPrime Factorization Results:")
    for ((index, number) in numbers.withIndex()) {
        if (isPrimeNumber(number)) {
            println("Number ${index + 1} ($number): This number is prime.")
        } else {
            println("Number ${index +1} ($number): Prime factors -> ${getPrimeFactors(number)}")
        }
    }
}

fun getPrimeFactors(n: Int): List<Int> {
    val factors = mutableListOf<Int>() // to save the collection of prime factors
    var number = n
    var divisor = 2
    while (divisor * divisor <= number) {
        while (number % divisor == 0) {
            factors.add(divisor)
            number /= divisor
        }
        divisor++
    }
    if (number > 1) {
        factors.add(number)
    }
    return factors
}

private fun isPrimeNumber(number: Int): Boolean {
    if (number < 2) return false
    /*for (i in 2 until number) {
        if (number % i == 0) return false
    }*/
    for (i in 2..Math.sqrt(number.toDouble()).toInt()) {
        if (number % i == 0) return false
    }
    return true
}