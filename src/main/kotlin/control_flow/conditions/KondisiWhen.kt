package com.dicodingdelfi.kotlin.control_flow.conditions

fun main() {
    val obj = "Hello"
    val number: Int = 1
    val trafficLightState = "Red"

    when (obj) {
        //checks whether obj equals to "1"
        "1" -> println("One")
        //checks whether obj equals to "Hello"
        "Hello" -> println("Greeting")
        //default statement
        else -> println("Unknown")
    }

    // when as an expression
    val result = when (obj) {
        "1" -> "One"
        "Hello" -> "Greeting"
        else -> "Unknown"
    }

    println(result)

    // traffic light
    val trafficAction = when (trafficLightState) {
        "Green" -> "Go"
        "Yellow" -> "Slow down"
        "Red" -> "Stop"
        else -> "Malfunction"
    }

    println(trafficAction)

}