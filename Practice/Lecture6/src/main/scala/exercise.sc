object exercise {
  val s = List(List(2,3), 3, List(5,1,2))


  /* Combination
  * to compute the scalar product of two vectors
  */
  val s2 = List(1, 2, 3)
  val M = 3; val N = 3
  (1 to M) flatMap(x => (1 to N) map ( y => x * y))
}