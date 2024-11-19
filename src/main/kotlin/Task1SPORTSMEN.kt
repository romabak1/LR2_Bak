package src.main.kotlin

fun findDayToReachDistance(initialDistance: Int, targetDistance: Int): Int {
    var day = 1
    var currentDistance = initialDistance.toDouble()
    while (currentDistance < targetDistance) {
        currentDistance += currentDistance * 0.1
        day++
    }
    return day
}

fun main() {
    val input = readLine()?.split(" ")
    if (input?.size != 2) {
        return
    }

    val initialDistance = input[0].toIntOrNull()
    val targetDistance = input[1].toIntOrNull()

    if (initialDistance == null || targetDistance == null) {
        return
    }

    val result = findDayToReachDistance(initialDistance, targetDistance)
    println("$result")
}
