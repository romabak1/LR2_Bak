package task9

fun calculateCandies(n: String): Int {
    var num = n.toMutableList() // Використовуємо MutableList для зручності
    var minCandy = num.last().digitToInt() // Ініціалізуємо мінімум останньою цифрою

    while (num.size > 1) {
        // Хід Марійки: шукаємо оптимальну перестановку
        for (i in 0 until num.size) {
            for (j in i + 1 until num.size) {
                // Змінюємо місцями i-ту та j-ту цифри
                num[i] = num[j].also { num[j] = num[i] }

                // Хід Максима: видаляємо останню цифру
                val removed = num.removeAt(num.size - 1)

                // Оновлюємо мінімум
                minCandy = minOf(minCandy, removed.digitToInt())

                // Повертаємо назад
                num.add(removed)

                // Відновлюємо порядок
                num[j] = num[i].also { num[i] = num[j] }
            }
        }

        // Після всіх перестановок видаляємо останню цифру
        num.removeAt(num.size - 1)
    }

    return minCandy
}

fun main() {
    val input = readLine()!!
    println(calculateCandies(input))
}
