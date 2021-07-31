import scala.collection.parallel.ParSeq

object PlayParallel extends App {
//  val list = List(1,2,3)

  val capacity = 200000
  val seq = 1 to capacity // serial
  val parSeq = ParSeq.tabulate(capacity)(i => i) // parallel

  println(seq.size)
  println(parSeq.size)

//  seq.foreach(i => print(s"$i,"))
//  println()
//  parSeq.foreach(i => print(s"$i,"))

  def measure[T](operation: => T): Long = {
    val time = System.currentTimeMillis()
    operation
    System.currentTimeMillis() - time
  }

  val serialTime = measure(seq.map(_ + 1))
  val parallelTime = measure(parSeq.map(_ + 1))
  println()
  println(s"serialTime : $serialTime")
  println(s"parallelTime : $parallelTime")
}

