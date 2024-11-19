import java.util.Scanner

fun main() {
    val scanner = Scanner(System.`in`)
    val n = scanner.nextInt()

    val (totalGiftsGiven, maxGifts) = calculateGiftsAndMax(n)
    println("$totalGiftsGiven $maxGifts")
}

fun calculateGiftsAndMax(n: Int): Pair<Long, Long> {
    var gifts: Long = n.toLong()
    var maxGifts: Long = gifts
    var totalGiftsGiven: Long = 0

    while (gifts != 1L) {
        if (gifts % 2 == 0L) {
            totalGiftsGiven += gifts / 2
            gifts /= 2
        } else {
            gifts = gifts * 3 + 1
        }
        maxGifts = maxOf(maxGifts, gifts)
    }

    return Pair(totalGiftsGiven, maxGifts)
}