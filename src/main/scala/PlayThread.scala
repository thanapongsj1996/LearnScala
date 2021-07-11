import java.util.concurrent.{Executors, RejectedExecutionException}

object PlayThread extends App {
  val runnable = new Runnable {
    override def run(): Unit = println("in parallel: " + Thread.currentThread().getName)
  }

  val t0 = new Thread(runnable)
  val t1 = new Thread(runnable)
  t0.start()
  t1.start()

  //  t0.join() // wait until to finish working..
  //  println("After t0.join")

  val t2 = new Thread(() => {
    println("inside t2")
  })
  t2.start()

  // Thread Pool
  val pool = Executors.newFixedThreadPool(3)
  pool.execute(() => {
    Thread.sleep(1000)
    println("Inside pool1")
  })

  pool.execute(() => {
    println("Inside pool2")
  })

  pool.execute(() => {
    println("Inside pool2")
  })

  // Not accept new execute but still work for pending command..
  pool.shutdown()
  println(s"pool.isShutdown: ${pool.isShutdown}")

  try {
    pool.execute(() => {
      println("Inside pool3")
    })
  } catch {
    case ex: RejectedExecutionException => println("Execution rejected...")
  }



}
