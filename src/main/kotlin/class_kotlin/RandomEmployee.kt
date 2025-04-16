package com.dicodingdelfi.kotlin.class_kotlin

import kotlin.random.Random

data class RandomEmployee(val name: String, var salary: Int)

class RandomEmployeeGenerator(var minSalary: Int, var maxSalary: Int) {
    val names = listOf("Delfi", "Ardo", "Gulo", "Jurlinus", "Darling", "Hendrik")
    fun generateEmployee() =
        RandomEmployee(names.random(), Random.nextInt(from = minSalary, until = maxSalary))
}

fun main() {
    val empGen = RandomEmployeeGenerator(10, 30)
    println(empGen.generateEmployee())
    println(empGen.generateEmployee())
    println(empGen.generateEmployee())
    empGen.minSalary = 50
    empGen.maxSalary = 100
    println(empGen.generateEmployee())
}
