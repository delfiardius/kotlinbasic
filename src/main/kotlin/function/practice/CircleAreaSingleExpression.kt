package com.dicodingdelfi.kotlin.function.practice

import kotlin.math.PI

fun circleAreaSingleExpression(radius: Int): Double = PI * radius * radius

fun main() {
    println(circleAreaSingleExpression(2))
}