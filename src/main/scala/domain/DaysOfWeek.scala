package domain

/**
  * Created by mesfinmebrate on 17/09/2016.
  */

object DayOfWeek extends Enumeration {
  val MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY, SUNDAY = Value
}

object DaysOfWeek {

  private val days: Array[DayOfWeek.Value] = Array(
    DayOfWeek.MONDAY, DayOfWeek.TUESDAY, DayOfWeek.WEDNESDAY, DayOfWeek.THURSDAY, DayOfWeek.FRIDAY,
    DayOfWeek.SATURDAY, DayOfWeek.SUNDAY
  )

  private var currentPosition = -1

  def next: DayOfWeek.Value = {
    currentPosition += 1
    currentPosition < 7 match {
      case false => currentPosition = 0
      case _ => // DO NOTHING
    }
    days(currentPosition)
  }
}