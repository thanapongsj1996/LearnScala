import scala.collection.mutable
import scala.util.Random

object PlayWaitNotify2 extends App {
  val queue = new mutable.Queue[Int]()
  val capacity = 3
  val r = new Random()

  val consumer = new Thread(() => {
    while (true) {
      queue.synchronized({
        if (queue.isEmpty) {
          println("[consumer] queue is empty, waiting for producer...")
          queue.wait()
        }

        val value = queue.dequeue()
        println("[consumer] consumed value : " + value)
        queue.notify() // wake producer up
      })
      Thread.sleep(600)
    }
  })

  val producer = new Thread(() => {
    var i: Int = 0
    while (true) {
      queue.synchronized({
        if (queue.size == capacity) {
          println("[producer] queue is full, waiting consumer")
          queue.wait()
        }

        queue.enqueue(i)
        println("[producer] produced " + i)
        i += 1
        queue.notify()
      })
      Thread.sleep(500)
    }
  })

//  consumer.start()
//  producer.start()

  // notifyAll
  val bell = new Object // shared object
  (1 to 5).foreach(i => {
    new Thread(() => {
      bell.synchronized({
        println(s"thread $i is waiting...")
        bell.wait()
      })
      // notified
      println(s"thread $i chaiyoooooo.....")
    }).start()
  })

  new Thread(() => {
    Thread.sleep(3000)
    bell.synchronized({
      bell.notifyAll()
    })
  }).start()
}
