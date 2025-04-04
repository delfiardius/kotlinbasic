package com.dicodingdelfi.kotlin.control_flow.conditions.practice

import kotlin.random.Random

fun main() {
    val firstResult = Random.nextInt(6)
    val secondResult = Random.nextInt(6)

    if (firstResult == secondResult) {
        println("You win :)")
    } else {
        println("You lose :(")
    }
}