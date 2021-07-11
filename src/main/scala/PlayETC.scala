object PlayETC extends App {

  // Companion Object
  class Car(val year: Int)
  object Car {
    def apply(year: Int) = new Car(year)
  }

  println(Car(2000).year)
  println(Car.apply(2000).year)

  // *
  def display(arr: Int*): Unit = arr.foreach(println)
  display(10, 20, 30, 40)

  val arr = List.tabulate(3)(i => List.tabulate(4)(j => (i+1) * (j+1)))
  arr.foreach(a => println(a))

  val arrStar = List.tabulate(5)(i => "* " * (i+1))
  arrStar.foreach(a => println(a))


  // Collection
  // Seq, Set, Map

  val seq1: Seq[Int] = Seq(1, 1, 2)
  println(seq1)
  // List(1, 1, 2)

  val set1: Set[Int] = Set(1, 1, 2)
  println(set1)
  // Set(1, 2)

  val map1: Map[String, Int] = Map("One" -> 1, "Two" -> 2)

  val list = List("apple", "banana")
  val list2 = list.flatMap(_.toUpperCase()) // List(A, P, P, L, E, B, A, N, A, N, A)
  println(list2)

  println(List(List(1,2),List(3,List(4,5))).flatten)

  val l = List(1,2,3).map(x => "* " * x) // List(* , * * , * * * )
  println(l)

  val l2  = List(1,2,3).map("+ " * _)
  println(l2)


}
