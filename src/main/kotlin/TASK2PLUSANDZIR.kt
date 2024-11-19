import java.util.Scanner

fun drawRectangle(n: Int, m: Int) {
    for (i in 0 until n) {
        if (i == 0 || i == n - 1) {
            println("*".repeat(m).replace("", " ").trim())
        } else {
            if (m > 1) {
                println("* " + "+ ".repeat(m - 2) + "*")
            } else {
                println("*")
            }
        }
    }
}

fun main() {
    val scanner = Scanner(System.`in`)
    val n = scanner.nextInt()
    val m = scanner.nextInt()
    drawRectangle(n, m)
}