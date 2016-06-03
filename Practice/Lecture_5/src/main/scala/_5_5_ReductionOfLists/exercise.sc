object exercise {
  val s = List(1, 2, 3, 4, 5)

  def sum(xs: List[Int]) = (0::xs) reduceLeft((x, y) => x + y)
  def product(xs: List[Int]) = (1::xs) reduceLeft((x, y) => x * y)

  sum(s)
  product(s)


}