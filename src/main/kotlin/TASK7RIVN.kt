fun main() {
    // Читання вхідних даних
    val (A, B, C, P, Q) = readLine()!!.split(" ").map { it.toInt() }

    var foundSolution = false
    for (x in P..Q) {
        // Підставляємо x в рівняння, щоб знайти y
        if ((C - A * x) % B == 0) {
            val y = (C - A * x) / B
            // Якщо y в межах діапазону
            if (y in P..Q) {
                println("$x $y")
                foundSolution = true
            }
        }
    }

    // Якщо не знайдено жодного розв'язку
    if (!foundSolution) {
        println(-1)
    }
}
