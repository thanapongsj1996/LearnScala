object Generic extends App {
  // Generic
  class MyList[T](value: T) {
    println("Inside MyList")

    def showValue: Unit = {
      if (value.isInstanceOf[Int]) {
        println("This is Int")
      } else if (value.isInstanceOf[String]) {
        println("This is String")
      } else {
        println("Unknown")
      }
    }
  }

  val intList = new MyList[Int](100)
  val stringList = new MyList[String]("Hello")
  val doubleList = new MyList[Double](10.50)

  intList.showValue
  stringList.showValue
  doubleList.showValue

  // Companion object
  object MyList {
    def emptyList[T]: Unit = println("This is empty")
  }

  MyList.emptyList[Int]
}
