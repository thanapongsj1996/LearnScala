object Queue extends App {
  val queue = collection.mutable.Queue[String]()

  queue.enqueue("A")
  queue.enqueue("B")
  queue.enqueue("C")
  queue.enqueue("D")

  println(s"queue $queue")
  println(s"last ${queue.last}")
  println(s"head ${queue.head}")

  println(s"size ${queue.size}")

  val e = queue.dequeue()
  println(s"e: $e")
}
