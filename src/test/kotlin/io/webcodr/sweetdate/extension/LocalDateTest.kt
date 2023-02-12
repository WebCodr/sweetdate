package io.webcodr.sweetdate.extension

import io.webcodr.sweetdate.unit.Days
import io.webcodr.sweetdate.unit.Months
import io.webcodr.sweetdate.unit.Weeks
import io.webcodr.sweetdate.unit.Years
import org.junit.jupiter.api.Test

import org.junit.jupiter.api.Assertions.*
import java.time.LocalDate

internal class LocalDateTest {
    private val baseDate = LocalDate.now()

    @Test
    fun testPlusDays() {
        val result = baseDate + Days(10)

        assertEquals(baseDate.plusDays(10), result)
    }

    @Test
    fun testPlusWeeks() {
        val result = baseDate + Weeks(10)

        assertEquals(baseDate.plusWeeks(10), result)
    }

    @Test
    fun testPlusMonths() {
        val result = baseDate + Months(10)

        assertEquals(baseDate.plusMonths(10), result)
    }

    @Test
    fun testPlusYears() {
        val result = baseDate + Years(10)

        assertEquals(baseDate.plusYears(10), result)
    }

    @Test
    fun testMinusDays() {
        val result = baseDate - Days(10)

        assertEquals(baseDate.minusDays(10), result)
    }

    @Test
    fun testMinusWeeks() {
        val result = baseDate - Weeks(10)

        assertEquals(baseDate.minusWeeks(10), result)
    }

    @Test
    fun testMinusMonths() {
        val result = baseDate - Months(10)

        assertEquals(baseDate.minusMonths(10), result)
    }

    @Test
    fun testMinusYears() {
        val result = baseDate - Years(10)

        assertEquals(baseDate.minusYears(10), result)
    }
}