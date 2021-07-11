object PlayOption extends App {
  val n: Option[Int] = Some(5)

  val l = List(1,2,3,4)
  val l2 = l.map(z => z * 2)
  println(l2)
}
