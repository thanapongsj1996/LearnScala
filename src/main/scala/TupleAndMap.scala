object TupleAndMap extends App {
  // Tuple
  val t1 = (10, "Name1", "LastName1")
  println(t1._1)
  println(t1._2)
  println(t1._3)

  val t2 = t1.copy(_2 = "Name2")
  println(t2._1)
  println(t2._2)
  println(t2._3)


  // Map ==> [Key, Value]
  val dict: Map[Int, String] = Map((1, "One"), 2 -> "Two")
  println(dict)
  println(dict.keys)
  println(dict.values)

  val newPair = (3, "Three")
  val newDict = dict + newPair
  println(newDict)
  println(newDict.contains(3))
  println(newDict(3))
  println(newDict.toList)

  val phoneBook: Map[String, Int] = Map(
    "Somchai" -> 1111,
    "Somsri" -> 2222
  )

  println(phoneBook)
  println(phoneBook("Somchai"))


}
