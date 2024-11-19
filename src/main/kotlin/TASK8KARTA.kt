fun main() {
    try {
        // Считываем значение N
        val n = readLine()!!.toInt()

        // Считаем ожидаемую сумму всех чисел от 1 до N
        val totalSum = n * (n + 1) / 2

        // Считываем и суммируем все введённые карты
        val inputSum = readLine()!!
            .trim()
            .split(" ")
            .filter { it.isNotBlank() }
            .map { it.toInt() }
            .sum()

        // Разница между полной суммой и суммой введённых чисел — это пропавшая карта
        val missingCard = totalSum - inputSum

        // Выводим результат
        println(missingCard)
    } catch (e: Exception) {
        println("Ошибка ввода: ${e.message}")
    }
}