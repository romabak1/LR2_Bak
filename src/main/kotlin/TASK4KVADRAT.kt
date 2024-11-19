fun main() {
    // Зчитуємо розміри прямокутника
    val (A, B) = readLine()!!.split(" ").map { it.toInt() }

    var a = A
    var b = B

    // Цикл, поки одна зі сторін не стане рівною 0
    while (a != 0 && b != 0) {
        // Визначаємо сторону квадрату, який можна відрізати
        val squareSide = minOf(a, b)

        // Виводимо розміри квадрату
        println("$squareSide x $squareSide")

        // Зменшуємо одну зі сторін на розмір відрізаного квадрату
        if (a > b) {
            a -= squareSide
        } else {
            b -= squareSide
        }
    }
}
