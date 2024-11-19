package task9

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class Task9Test {

    @Test
    fun testSmallNumber() {
        val input = "12"
        val expectedOutput = "2"
        assertEquals(expectedOutput, calculateCandies(input))
    }

    @Test
    fun testMediumNumber() {
        val input = "1234"
        val expectedOutput = "1"
        assertEquals(expectedOutput, calculateCandies(input))
    }

    @Test
    fun testLargeNumber() {
        val input = "3412"
        val expectedOutput = "4"
        assertEquals(expectedOutput, calculateCandies(input))
    }

    @Test
    fun testSingleDigitNumber() {
        val input = "9"
        val expectedOutput = "9"
        assertEquals(expectedOutput, calculateCandies(input))
    }

    @Test
    fun testLongNumber() {
        val input = "987654321"
        val expectedOutput = "1"
        assertEquals(expectedOutput, calculateCandies(input))
    }
}
