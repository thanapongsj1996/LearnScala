object PlayWaitNotify extends App {
  class SimpleContainer {
    private var value: Int = 0
    def isEmpty(): Boolean = value == 0
    def get(): Int = {
      val result = value
      value = 0
      result
    }
    def set(newValue: Int): Unit = {
      value = newValue
    }
  }


  val container = new SimpleContainer // shared object/instance
  val consumer = new Thread(() => {
    println("consumer is waiting...")
    container.synchronized({
      container.wait() // until get notify from other thread
    })
    println("consumer has consumed : " + container.get())
    println("in consumer , container is empty : " + container.isEmpty())
  })

  val producer = new Thread(() => {
    println("producer is working...")
    Thread.sleep(2000)
    val x = 100

    container.synchronized({
      container.set(x)
      println("producer has finished producing")
      container.notify()
      println("producer has finished notify")
    })
  })

  consumer.start()
  producer.start()
}
