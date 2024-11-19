fun main() {
    // Зчитуємо координати клітинки шахівниці
    val (x, y) = readLine()!!.split(" ").map { it.toInt() }

    val moves = mutableListOf<Pair<Int, Int>>()

    // Лівий верхній кут
    var i = x - 1
    var j = y - 1
    while (i >= 1 && j >= 1) {
        moves.add(Pair(i, j))
        i--
        j--
    }

    // Правий верхній кут
    i = x - 1
    j = y + 1
    while (i >= 1 && j <= 8) {
        moves.add(Pair(i, j))
        i--
        j++
    }

    // Лівий нижній кут
    i = x + 1
    j = y - 1
    while (i <= 8 && j >= 1) {
        moves.add(Pair(i, j))
        i++
        j--
    }

    // Правий нижній кут
    i = x + 1
    j = y + 1
    while (i <= 8 && j <= 8) {
        moves.add(Pair(i, j))
        i++
        j++
    }

    // Виводимо всі можливі координати
    moves.forEach { println("${it.first} ${it.second}") }
}
