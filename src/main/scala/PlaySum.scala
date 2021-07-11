import java.io.PrintWriter
import scala.io.Source

object PlaySum extends App {
  val a = List(10, 20)
  println(a.sum)


  def mySum(list: List[Int]): Int = {
    var sum = 0
    for (i <- list) {
      sum += i
    }
    sum
  }

  def mySum2(list: List[Int]): Int = {
    list match {
      case Nil => 0
      case x :: tail => x + mySum2(tail)
    }
  }

  println(mySum(a))
  println(mySum2(a))

  val src = Source.fromFile("matrix.txt")
  val lines = src.getLines()
  val rowSum = lines.map(line => line.split(" ").map(str => str.toDouble).sum)

  val pw = new PrintWriter("output.txt")
  rowSum.foreach(row => pw.println(row))
  pw.close()

}
