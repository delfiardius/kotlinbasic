package com.dicodingdelfi.kotlin.class_kotlin

data class Person(val name: Name, val address: Address, val ownsAPet: Boolean = true)
data class Name(val first: String, val last: String)
data class Address(val street: String, val city: City)
data class City(val name: String, val countryCode:  String)

fun main() {
    val person = Person(
        Name("Ardi", "Gulo"),
        Address("Kav. Bukit Layang, Tanjung Piayu", City("Kota Batam", "BP")),
        ownsAPet = false
    )

    println(person)
}