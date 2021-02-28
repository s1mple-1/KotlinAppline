package module3

import kotlin.math.sqrt

fun main() {
    val d = 4.0
    println(d.extSqrt())
}

fun Double.extSqrt(): Double {
    return sqrt(this)
}