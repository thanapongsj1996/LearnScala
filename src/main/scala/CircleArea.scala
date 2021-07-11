object CircleArea extends App {
  print("Input radius : ")
  val radius = io.StdIn.readDouble()

  def calculateCircleArea(r: Double): Double = {
    return math.Pi * math.pow(r, 2)
  }

  println(f"Circle area is ${calculateCircleArea(radius)}%2.2f")
}
