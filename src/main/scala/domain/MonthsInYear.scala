package domain

/**
  * Created by mesfinmebrate on 17/09/2016.
  */
sealed trait MonthOfYear {
  def numberOfDays: Int
}

case object January extends MonthOfYear {
  val numberOfDays = 31
}

case object February extends MonthOfYear {
  val numberOfDays = 28
}

case object March extends MonthOfYear {
  val numberOfDays = 31
}

case object April extends MonthOfYear {
  val numberOfDays = 30
}

case object May extends MonthOfYear {
  val numberOfDays = 31
}

case object June extends MonthOfYear {
  val numberOfDays = 30
}

case object July extends MonthOfYear {
  val numberOfDays = 31
}

case object August extends MonthOfYear {
  val numberOfDays = 31
}

case object September extends MonthOfYear {
  val numberOfDays = 30
}

case object October extends MonthOfYear {
  val numberOfDays = 31
}

case object November extends MonthOfYear {
  val numberOfDays = 30
}

case object December extends MonthOfYear {
  val numberOfDays = 31
}

object MonthsInYear {

  val months: Array[MonthOfYear] = Array(
    January, February, March, April, May, June, July, August, September, October, November, December
  )
}