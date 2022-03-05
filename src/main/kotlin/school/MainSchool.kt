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
 * Находим местро постройки через медиану
 */
fun school(n: Int, coord : IntArray): Int {
    val medianIndex = n / 2
    return coord[medianIndex]
}