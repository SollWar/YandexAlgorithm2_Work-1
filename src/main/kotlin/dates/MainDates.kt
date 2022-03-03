package dates

fun main() {
    val scan = java.util.Scanner(System.`in`)
    val x = scan.nextInt()
    val y = scan.nextInt()
    val z = scan.nextInt()
    print(dates(x, y))
}

fun dates(x: Int, y: Int): Int {
    if (x <= 12 && y > 12) return 1
    else if (y <= 12 && x > 12) return 1
    else if (x == y) return 1
    return 0
}