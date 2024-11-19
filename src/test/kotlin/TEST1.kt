package src.test.kotlin

import src.main.kotlin.findDayToReachDistance
import kotlin.test.Test
import kotlin.test.assertEquals

class FindDayToReachDistanceTest {

    @Test
    fun testExample1() {
        val initialDistance = 10
        val targetDistance = 15
        val expectedDay = 6
        assertEquals(expectedDay, findDayToReachDistance(initialDistance, targetDistance))
    }

    @Test
    fun testMinimalValues() {
        val initialDistance = 1
        val targetDistance = 1
        val expectedDay = 1
        assertEquals(expectedDay, findDayToReachDistance(initialDistance, targetDistance))
    }

    @Test
    fun testExactTargetDistance() {
        val initialDistance = 10
        val targetDistance = 10
        val expectedDay = 1
        assertEquals(expectedDay, findDayToReachDistance(initialDistance, targetDistance))
    }

    @Test
    fun testLargeTargetDistance() {
        val initialDistance = 10
        val targetDistance = 1000
        val expectedDay = 73
        assertEquals(expectedDay, findDayToReachDistance(initialDistance, targetDistance))
    }

    @Test
    fun testIncreasingValues() {
        val initialDistance = 5
        val targetDistance = 20
        val expectedDay = 9
        assertEquals(expectedDay, findDayToReachDistance(initialDistance, targetDistance))
    }
}
