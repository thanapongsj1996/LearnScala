object Array extends App {
 val a = List(10, 20, 30, 40)

  println(a.filter(_ > 20))
  println(a.count(_ > 20))

  println(a.sum)


 println("--- Array ---")

 val numbsArr = new Array[Int](10)
 numbsArr.zipWithIndex.foreach{ case (elem, idx) => {
  println(s"original element: ${elem} => index: ${idx}")
 }}
}
