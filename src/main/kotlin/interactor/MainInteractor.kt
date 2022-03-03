package interactor

fun main() {
    val scan = java.util.Scanner(System.`in`)
    val code = scan.nextInt()
    val iter = scan.nextInt()
    val check = scan.nextInt()
    var verdict = iter
    when (iter) {
        0 -> verdict = if (code != 0) 3 else check
        1 -> verdict = check
        4 -> verdict = if (code != 0) 3 else 4
        6 -> verdict = 0
        7 -> verdict = 1
    }
    print(verdict)
}