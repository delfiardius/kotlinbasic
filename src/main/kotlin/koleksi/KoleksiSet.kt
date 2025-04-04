package com.dicodingdelfi.kotlin.koleksi

fun main() {
    // Read only set
    val readOnlyFruit = setOf("apple", "banana", "cherry", "cherry")

    // Mutable set with explicit type declaration
    val fruit: MutableSet<String> = mutableSetOf("apple", "banana", "cherry", "cherry")
        val fruitLocked: Set<String> = fruit

    println(readOnlyFruit)

    // Get the number of items in a set
    println("This set has ${readOnlyFruit.count()} items")

    // Check the item is in a set
    println("banana" in readOnlyFruit)

    // Add item to mutable set
    fruit.add("dragonfruit")
    println(fruitLocked)

    // Remove item from a mutable set
    fruit.remove("cherry")
    println(fruitLocked)

}