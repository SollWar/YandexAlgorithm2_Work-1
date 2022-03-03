package school

fun main() {
    val scan = java.util.Scanner(System.`in`)
    val n = scan.nextInt()
    val coord = IntArray(n)
    repeat(n) {
        coord[it] = scan.nextInt()
    }
    println(school(n, coord))
}

/**
 * Местро постройки находится по медиане, но нужна быстрая и сортировка массива
 */
fun school(n: Int, coord : IntArray): Int {
    coord.sort()
    val medianIndex = n / 2
    return coord[medianIndex]
}