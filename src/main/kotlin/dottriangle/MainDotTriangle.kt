package dottriangle

import kotlin.math.sqrt

fun main() {
    val scan = java.util.Scanner(System.`in`)
    val d = scan.nextInt()
    val a = scan.nextInt()
    val b = scan.nextInt()

    println(dotTriangle(a, b, d))
}

fun dotTriangle(a: Int, b: Int, d: Int): Int {
    // Проверка входит ли точка - нагло стырено с интернета
    val x1 = 0 - (d - 0) * (0 - b)
    val x2 = (d - a) * (d - 0) - (0 - d) * (0 - b)
    val x3 = (0 - a) * (0 - d)

    if ((x1 >= 0 && x2 >= 0 && x3 >= 0) || (x1 <= 0 && x2 <= 0 && x3 <= 0)) return 0

    // Расстояния от точки до вершин
    val aX = sqrt(((a - 0.0) * (a - 0.0)) + ((b - 0.0) * (b - 0.0)))
    val bX = sqrt(((a - d) * (a - d)) + ((b - 0.0) * (b - 0.0)))
    val cX = sqrt(((a - 0.0) * (a - 0.0)) + ((b - d) * (b - d)))

    return if (aX <= bX && aX <= cX) 1
    else if (bX <= aX && bX <= cX) 2
    else 3
}