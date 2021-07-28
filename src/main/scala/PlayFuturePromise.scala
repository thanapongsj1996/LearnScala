import scala.concurrent.{Await, Future, Promise}
import scala.concurrent.ExecutionContext.Implicits.global
import scala.concurrent.duration._
import scala.util.{Failure, Success}

object PlayFuturePromise extends App {
  val f = Future {
    println("test")
  }

  Await.result(f, 1.seconds)

//  Thread.sleep(100)

  println("hi")
  println("there")

  val myFuture = Future {
    Thread.sleep(1000)
    100
    throw new RuntimeException("Let's error")
  }

  myFuture.onComplete {
    case Success(value) => println("Success : " + value)
    case Failure(exception) => exception match {
      case ex: Exception => println("Got exception : " + ex)
    }
  }

//  Thread.sleep(1100)


  val num1 = Future(1)
  val num2 = Future(2)

  val sum = for {
    a <- num1
    b <- num2
  } yield a + b

  sum.onComplete {
    case Success(value) => println("Sum success : " + value)
    case Failure(exception: Exception) => println("Error : " + exception)
  }

  val myPromise = Promise[Int]()
  // Main thread
  myPromise.future.onComplete {
    case Success(value) => println("Promise future success : " + value)
    case Failure(exception: Exception) => println("Error: " + exception)
  }

  new Thread(() => {
    println("fetching the number...")
    Thread.sleep(200)
    myPromise.success(99)

    println("Done..")
  }).start()


}
