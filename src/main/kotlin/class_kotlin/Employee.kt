package com.dicodingdelfi.kotlin.class_kotlin

data class Employee(val name: String, var salary: Int)

fun main() {
    val emp = Employee("Ardi", 20)
    println(emp)
    emp.salary += 10
    println(emp)
}
