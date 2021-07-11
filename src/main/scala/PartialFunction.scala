object PartialFunction extends App {
  val aPartialFunction: Int => Int = {
    case 1 => 10
    case 2 => 20
  }
  println(aPartialFunction(1))

  val aPF = new PartialFunction[Int, Int] {
    override def isDefinedAt(x: Int): Boolean = {
      x == 1 || x == 2
    }
    override def apply(v1: Int): Int = v1 match {
      case 1 => 10
      case 2 => 20
    }
  }
  println(aPF.isDefinedAt(5))
  println(aPF(2))

  val result = if (aPF.isDefinedAt(3)) aPF(3) else 0
  println(s"result $result")

  val aPF2: PartialFunction[Int, String] = {
    case 1 => "One"
    case 2 => "Two"
  }
  println(aPF2(2))

  def pf(x: Int): Int = x match {
    case 1 => 10
    case 2 => 20
  }
  println(pf(1))

  val chatBot: PartialFunction[String, String] = {
    case "hi" => "Hi, my name is HAL777"
    case "weather" => "Rainy"
    case _ => "I don't get it"
  }
//  scala.io.Source.stdin.getLines().foreach(line => println(chatBot(line)))
  scala.io.Source.stdin.getLines().map(chatBot).foreach(println)



}
