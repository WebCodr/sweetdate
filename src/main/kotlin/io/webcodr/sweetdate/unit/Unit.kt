package io.webcodr.sweetdate.unit

sealed class Unit

class Days(val days: Long): Unit()
class Weeks(val weeks: Long): Unit()
class Months(val months: Long): Unit()
class Years(val years: Long): Unit()
