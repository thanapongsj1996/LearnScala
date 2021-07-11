object PlaySingleton extends App {
  // static class

  class Book {
    println("Inside book")
  }

  object Car {
    println("inside car")
  }

  Car  // Singleton object
  new Book

  // Singleton object & overloading method
  object Calculator {
    def Add(a: Int, b: Int): Int = a + b
    def Add(a: Int, b: Int, c: Int): Int = a + b + c
  }

  val result = Calculator.Add(10, 20)
  println(s"Result : $result")

  val result2 = Calculator.Add(10, 20, 30)
  println(s"Result : $result2")
}
