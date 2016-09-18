package solution

import domain._

/**
  * Created by mesfinmebrate on 18/09/2016.
  */
object SundaySolution extends App {

  val FEBRUARY_LEAP_CAPACITY = 29

  val startYear = 1901
  val endYear = 2000

  def firstSundays: Int = {
    (startYear to endYear).flatMap { year =>
      MonthsInYear.months.flatMap { month =>
        (1 to month.numberOfDays).filter { date =>
          isFirstSunday(date, DaysOfWeek.next)
        }
      }
    }.size
  }

  def isFirstSunday(date: Int, day: DayOfWeek.Value): Boolean = {
    date == 1 && day == DayOfWeek.SUNDAY
  }

  def getNumberOfDays(month: MonthOfYear, year: Int): Int = {
    if (month == February && isLeapYear(year)) FEBRUARY_LEAP_CAPACITY else month.numberOfDays
  }

  def isLeapYear(year: Int): Boolean = {
    if (isCentury(year)) {
      isLeapCentury(year)
    }
    else {
      year % 4 == 0
    }
  }

  def isCentury(year: Int): Boolean = {
    year % 100 == 0
  }

  def isLeapCentury(year: Int): Boolean = {
    year % 400 == 0
  }

  val before = System.currentTimeMillis
  val solution = firstSundays
  val after = System.currentTimeMillis
  val time: Double = (after - before)/1000

  println(s"Number of First Sundays = $solution")
  println(s"Solution found in $time seconds")
}