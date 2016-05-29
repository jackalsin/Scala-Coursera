import Two5ObjectsAndClasses.Rational

object rationals {
  3 + 2
  val x = new Rational(1, 3)
  val y = new Rational(2, 5)
//  val z = new Rational(2, 0)

  /* Two ways to use the method <
  * the first one is infix operator
  * the second line is call method */
  x < y
  x.<(y)

  /* unary */
  -x
}
