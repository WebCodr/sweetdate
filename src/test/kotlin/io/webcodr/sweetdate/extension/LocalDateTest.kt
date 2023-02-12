package io.webcodr.sweetdate.extension

import io.webcodr.sweetdate.unit.Days
import io.webcodr.sweetdate.unit.Months
import io.webcodr.sweetdate.unit.Weeks
import io.webcodr.sweetdate.unit.Years
import org.junit.jupiter.api.Test

import org.junit.jupiter.api.Assertions.*
import java.time.LocalDate

internal class LocalDateTest {
    @Test
    fun testPlusDays() {
        val baseDate = LocalDate.now()
        val result = baseDate + Days(10)

        assertEquals(baseDate.plusDays(10), result)
    }

    @Test
    fun testPlusWeeks() {
        val baseDate = LocalDate.now()
        val result = baseDate + Weeks(10)

        assertEquals(baseDate.plusWeeks(10), result)
    }

    @Test
    fun testPlusMonths() {
        val baseDate = LocalDate.now()
        val result = baseDate + Months(10)

        assertEquals(baseDate.plusMonths(10), result)
    }

    @Test
    fun testPlusYears() {
        val baseDate = LocalDate.now()
        val result = baseDate + Years(10)

        assertEquals(baseDate.plusYears(10), result)
    }
}