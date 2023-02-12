package io.webcodr.sweetdate.unit

import java.time.temporal.ChronoUnit

sealed class Unit(val value: Long) {
    abstract val chronoUnit: ChronoUnit
}

class Days(value: Long): Unit(value) {
    override val chronoUnit = ChronoUnit.DAYS
}
class Weeks(value: Long): Unit(value) {
    override val chronoUnit = ChronoUnit.WEEKS
}
class Months(value: Long): Unit(value) {
    override val chronoUnit = ChronoUnit.MONTHS
}
class Years(value: Long): Unit(value) {
    override val chronoUnit = ChronoUnit.YEARS
}
