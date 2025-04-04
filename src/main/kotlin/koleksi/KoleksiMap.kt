package com.dicodingdelfi.kotlin.koleksi

fun main() {
    // Read only map
    val readOnlyJuiceMenu = mapOf(
        "apple" to 100,
        "kiwi" to 190,
        "orange" to 100,
    )
    println(readOnlyJuiceMenu)

    // Mutable map with explicit type declaration
    val juiceMenu: MutableMap<String, Int> = mutableMapOf(
        "apple" to 100,
        "kiwi" to 190,
        "orange" to 100,
    )
    val juiceMenuLocked: Map<String, Int> = juiceMenu
    println(juiceMenuLocked)

    // access a value in a map using indexed access operator[] with its key:
    println("The value of apple juice is: ${readOnlyJuiceMenu["apple"]}")

    // add items to a mutable map with indexed access operator[]
    juiceMenu["coconut"] = 150
    println(juiceMenu)

    // to remove items from a mutable map, use the .remove() function:
    juiceMenu.remove("orange")
    println(juiceMenu)

    // to get the number of items in a map, use the .count() function:
    println("This map has ${readOnlyJuiceMenu.count()} key-value pairs")

    // to check if a specific key is already included in a map, use the .containsKey() function:
    println(readOnlyJuiceMenu.containsKey("kiwi"))

    // to obtain a collection of the keys or values of a map, use the keys and values properties respectively:
    println(readOnlyJuiceMenu.keys)
    println(readOnlyJuiceMenu.values)

    // to check that a key or value is in a map, use the in operator:
    println("orange" in readOnlyJuiceMenu.keys)
    println(200 in readOnlyJuiceMenu.values)

    val SUPPORTED = setOf("HTTP", "HTTPS", "FTP")
    val requested = "smtp"
    val isSupported = requested.uppercase() in SUPPORTED
    println("Support for $requested: $isSupported")
}