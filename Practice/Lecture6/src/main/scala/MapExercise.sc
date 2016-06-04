object MapExercise {

  val fruit = List("apple", "pear", "orange", "pineapple")
  fruit.sorted
  fruit.sortWith(_.length < _.length)

  fruit groupBy(_.head)

  class Poly(val terms: Map[Int, Double]) {
    def + (other: Poly) = new Poly(terms ++ (other.terms map adjust))
    def adjust(term: (Int, Double)): (Int,Double) = {
      val (exp, coeff) = term
      terms get exp match {
        case Some(coeff1) => exp -> (coeff + coeff1)
        case None => exp -> coeff
      }
    }

    override def toString = (for((exp, coeff) <- terms.toList) yield coeff +"x^"+ exp ) mkString " + "
  }

  val p1 = new Poly(Map(1 -> 2.0, 3 -> 4.0, 5 -> 6.2))
  val p2 = new Poly(Map(1 -> 2.0, 3 -> 4.0, 5 -> 6.2))

  p1 + p2

}