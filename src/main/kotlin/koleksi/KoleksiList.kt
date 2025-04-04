package com.dicodingdelfi.kotlin.koleksi

fun main() {
    //Read only list
    val readOnlyShapes = listOf("triangle", "square", "circle")
    println(readOnlyShapes)

    //Mutable list with explicit type declaration
    var shapes: MutableList<String> = mutableListOf("triangle", "square", "circle")
        val shapesLocked: List<String> = shapes
    println(shapesLocked)

    //Access an item in a list, use the indexed access operator []
    //The index always start from 0
    println("The first item in the list is: ${readOnlyShapes[0]}")

    // To get the first or last itme in alist, use .first() and .last() functions respectively:
    println("The first item in the list is: ${readOnlyShapes.first()}")
    println("The first item in the list is: ${readOnlyShapes.last()}")

    // To get the number of items in a list (jumlah item), use the .count() function:
    println("This list has ${readOnlyShapes.count()} items")

    // To check that an items is in a list, use the "in" operator
    println("circle" in readOnlyShapes)

    // To add or remove items from a mutable list, use .add() and .remove() function repectively:
    // Add "pentagon" to the list
    shapes.add("pentagon")
    println(shapes)

    // Remove "pentagon" from the list
    shapes.remove("pentagon")
    println(shapes)

}