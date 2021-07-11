object PlayTypeFunction extends App {
  // lambda
  val addFunc = (x: Int, y: Int) => x + y
  println(addFunc(10, 20))

  val add5 = (x: Int) => addFunc(5, x)
  println(add5(10))

  val addF = new Function[Int, Int] {
    override def apply(v1: Int): Int = v1 + 1
  }
  println(addF(10))

  val addFunc2 = new ((Int, Int) => Int) {
    override def apply(v1: Int, v2: Int): Int = v1 + v2
  }
  println(addFunc2(5, 7))

  def concat(s1: String, s2: String): String = {
    return s1 + s2
  }
  println(concat("Hello ", "Scala"))

  def concat2: (String, String) => String = new ((String, String) => String) {
    override def apply(v1: String, v2: String): String = v1 + v2
  }
  println(concat2("Hello ", "Scala2"))

  val concat3 = new ((String, String) => String) {
    override def apply(v1: String, v2: String): String = v1 + v2
  }
  println(concat3("Hello ", "Scala3"))


}
