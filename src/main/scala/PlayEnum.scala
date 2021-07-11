import PlayEnum.WeekDay.WeekDay

object PlayEnum extends App {
  object WeekDay extends Enumeration {
    type WeekDay = Value
    val Sun, Mon, Tue, Wed, Thu, Fri, Sat = Value
  }

  def isWorkingDay(day:WeekDay): Boolean = {
    return !(day == WeekDay.Sat || day == WeekDay.Sun)
  }

  val day: WeekDay = WeekDay.Sun
  if (isWorkingDay(day)) {
    println("Working.")

  } else {
    println("Weekend")
  }

  object Month {
    val Jan = 1
    val Feb = 2
    val Dec = 12
  }

  println(Month.Dec)
}
