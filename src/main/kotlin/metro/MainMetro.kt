package metro


fun main() {
    val input = readLine()!!.split(" ")
    val n = input[0].toInt()
    val i = if (input[1].toInt() < input[2].toInt()) input[1].toInt() else input[2].toInt() // меняем местами если
    val j = if (input[1].toInt() > input[2].toInt()) input[1].toInt() else input[2].toInt() // что-бы i > j
    val right = j - i - 1
    val left = (i - 1) + (n - j)
    if (right > left) print(left) else print(right)
}