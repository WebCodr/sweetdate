package io.webcodr.sweetdate.extension

import io.webcodr.sweetdate.unit.Unit
import java.time.LocalDate

enum class Sign {
    PLUS, MINUS
}

fun add(
    date: LocalDate,
    unit: Unit,
    sign: Sign
): LocalDate {
    val value = when(sign) {
        Sign.PLUS -> unit.value
        Sign.MINUS -> -unit.value
    }

    return date.plus(value, unit.chronoUnit)
}

operator fun LocalDate.plus(unit: Unit): LocalDate {
    return add(this, unit, Sign.PLUS)
}

operator fun LocalDate.minus(unit: Unit): LocalDate {
    return add(this, unit, Sign.MINUS)
}
