object Hello extends App {
  val name: String = "Boy"
  println(s"your name is $name")

  val friends: List[String] = List("pong", "boy", "bank")
  for (f <- friends) {
    println(s"My name : $f")
  }

  for (i <- 0 to friends.length - 1) {
    println(s"ggg ${friends(i)}")
  }

  friends.foreach(f => {
    println(s"zzzzzzz $f")
  })

  def hello(name: String): Unit = {
    println(s"Hello $name")
  }

  def mul2(n: Double): Double = {
    return n * 2
  }

  println(mul2(22.2))

//  hello(123)

//  function sdfsdf() {
//
//  }
  /*
    for (const f of friend) {
      console.log
    }

    for (let i = 0; i < friend.length; i++) {

    }
   */
}
