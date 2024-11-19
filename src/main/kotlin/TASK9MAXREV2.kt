
fun minReverseToEven(n: String): Int {
    if (n.last().toInt() % 2 == 0) return 0

    for (i in n.indices) {
        if (n[i].toInt() % 2 == 0) {
            return if (i == 0) 1 else 2
        }
    }

    return -1
}

fun main() {
    val numbers = List(5) { readLine()!! }

    for (n in numbers) {
        println(minReverseToEven(n))
    }
}