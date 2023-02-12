package io.webcodr.sweetdate.extension

import io.webcodr.sweetdate.unit.Days
import io.webcodr.sweetdate.unit.Months
import io.webcodr.sweetdate.unit.Unit
import io.webcodr.sweetdate.unit.Weeks
import io.webcodr.sweetdate.unit.Years
import java.time.LocalDate

operator fun LocalDate.plus(unit: Unit): LocalDate {
    return when(unit) {
        is Days -> this.plusDays(unit.days)
        is Weeks -> this.plusWeeks(unit.weeks)
        is Months -> this.plusMonths(unit.months)
        is Years -> this.plusYears(unit.years)
    }
}
