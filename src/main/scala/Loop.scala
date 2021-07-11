object Loop extends App {
  // for loop
  for (i <- 1 to 10 if i % 2 == 0) {
    println(i)
  }

  // for yield
//  val v = for (i <- 1 to 20 if i % 3 == 0) yield {
//    println("inside for yield")
//    i
//  }
//  println(v)

  var x = for {
    i <- 1 to 2
    j <- i to 3
  } yield {
    println(s"i = $i, j = $j")
    i * j
  }
  println(s"x : $x")
  x.foreach(println)
}