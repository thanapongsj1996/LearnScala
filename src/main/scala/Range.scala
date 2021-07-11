object Range extends App {
  val r = for (i <- 10 to 0 by -2) yield { i }
  println(r)
}
