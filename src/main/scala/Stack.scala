object Stack extends App {
  var st = collection.mutable.Stack[String]()
  st.push("a")
  st.push("b")
  st.push("c")
  st.push("d")

  println(s"st : $st")
  println(s"last: ${st.last}")
  println(s"head: ${st.head}")

  println(s"length: ${st.length}")
  println(s"size: ${st.size}")

  val l = st.pop()

  println(l)
  println(st)
  def isValid(s: String): Boolean = {
    var stk = collection.mutable.Stack[Char]()

    for (str <- s) {
      if (stk.isEmpty) {
        stk.push(str)
      } else if (stk.head == '(' && str == ')') {
        stk.pop()
      } else if (stk.head == '[' && str == ']') {
        stk.pop()
      } else if (stk.head == '{' && str == '}') {
        stk.pop()
      } else {
        stk.push(str)
      }
    }

    return stk.isEmpty
  }

  println(isValid("(){"))

}
