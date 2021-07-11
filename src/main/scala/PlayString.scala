object PlayString extends App {
  val s = "Hello World"
  val c = "A"

  println(s.take(3))
  println(s.substring(6,8))
  println(s.slice(6,8))
  println(s.replace('l', 'x'))
  println(s.concat("Boy boy"))
  println(s.length)
  println(s.indexOf('H'))
  println(s.contains("or"))
  println(s.toList)
  println(s.toSeq.sorted)
//  s.toArray.foreach(print)
  println(s.patch(5, "Opps", 1))


  val s1 = "Hello Worldz"
  val s2 = "12345 6789332"

  println(s1.zip(s2))
}
