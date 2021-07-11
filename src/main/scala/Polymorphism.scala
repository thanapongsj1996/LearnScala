object Polymorphism extends App {
  abstract class Shape {
    def Area: Double
  }

  class Triangle(w: Double, h: Double) extends Shape {
    override def Area: Double = 0.5 * w * h
  }

  class Square(w: Double, h: Double) extends Shape {
    override def Area: Double = w * h
  }

  val t = new Triangle(10, 20)
  println(t.Area)

  val s = new Square(10, 20)
  println(s.Area)

  val shape1: Shape = new Triangle(20, 30)
  println(shape1.Area)

  val shape2: Shape = new Square(20, 30)
  println(shape2.Area)
}
