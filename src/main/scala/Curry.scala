object Curry extends App {
  def add(x: Int)(y: Int): Int = x + y

  val add3 = add(3)(_)
  val ten = add3(7)

  println(ten)
}
