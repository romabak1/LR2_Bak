fun main() {
    var cnt = 0  // Лічильник, спочатку 0
    var previousNumber: Int? = null  // Перемінна для збереження попереднього числа

    while (true) {
        val input = readLine()!!.toInt()  // Зчитуємо число

        if (input == 0) {
            break  // Якщо число 0, виходимо з циклу
        }

        // Перевірка, чи більше поточне число за попереднє
        if (previousNumber != null && input > previousNumber) {
            cnt++  // Збільшуємо лічильник
        }

        // Оновлюємо попереднє число
        previousNumber = input
    }

    println(cnt)  // Виводимо результат
}
