object CaseClass extends App {
  // case class => match pattern
  case class Book(id: Int, name: String, author: String)

  val b1 = Book(1, "Onepiece", "Oda")
  val b2 = Book(2, "Scala Book", "Martin")
  val b3 = Book(3, "C++", "Someone")

  b1 match {
    case Book(1, _, _) => println("This is Onepiece")
    case Book(_, _, "Martin") => println("This is Scala book")
    case _ => println("Not match")
  }


  case class Product(id: Int, price: Int)

  println(Product(1, 100) == Product(2, 100))
}
