# Sweet Date

An experitmental set of Kotlin extension function operators and sealed classes with syntactic sugar to add and substract chrono units from LocalDate.

## Example

~~~ kotlin
import io.webcodr.sweetdate.unit.Days
import java.time.LocalDate

LocalDate.now() + Days(10)
~~~ 

## Available chrono units

* io.webcodr.sweetdate.unit.Days
* io.webcodr.sweetdate.unit.Weeks
* io.webcodr.sweetdate.unit.Months
* io.webcodr.sweetdate.unit.Years
