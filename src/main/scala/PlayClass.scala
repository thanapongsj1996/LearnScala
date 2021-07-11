object PlayClass extends App {
  class Car(private val year: Int, val model: String, owner: String) {
    println("Start constructor !")
    private val machine: String = "Hybrid"
    def run(distance: Int): Unit = {
      println("This car is running around " + distance + " meters, machine " + machine)
    }
    def fill(l: Int): Unit = {
      println(s"We've filled oil in $l l")
    }
  }
  val myCar = new Car(1996, "X", "Boy")
  println(myCar.model + " ")
  myCar.run(2000)
  myCar.fill(200)

  abstract class Animal {
    def eat
    def walk
  }

  class Cat(val name: String) extends Animal {
    override def eat: Unit = println(s"Cat ($name) is eating")
    override def walk: Unit = println(s"Cat ($name) is walking")
  }

  class Dog extends Animal {
    override def eat: Unit = println("Dog is eating")
    override def walk: Unit = println("Dog is walking")
  }

  class Human {
    def eat: Unit = println("Human can eat food")
    def work: Unit = println("Human have to work")
  }

  class ModernHuman extends Human with Doctor with Programmer {
    override def work: Unit = {
      super.work
      println("Modern human can work smarter than normal human")
    }

    override def Heal: Unit = println("Modern human can heal")
  }

  val boy = new ModernHuman()
  boy.work
  val m = new Cat("mmm")
  m.eat
  val d = new Dog
  d.eat


  // interface ==> trait
  trait Doctor {
    def Heal
  }
  trait Programmer {
    def WriteCode: Unit = println("Programmer like coding")
  }

  val superman = new ModernHuman
  superman.eat
  superman.work
  superman.Heal
  superman.WriteCode

}
