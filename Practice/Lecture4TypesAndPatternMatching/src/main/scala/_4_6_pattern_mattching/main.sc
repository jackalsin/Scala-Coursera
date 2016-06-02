import _4_6_pattern_mattching._

object main {

  def eval(e: Expr) : Int = e  match {
    case Number(n) => n
    case Sum(e1, e2) => eval(e1) + eval(e2)
  }


  eval(Sum(Number(3), Number(6)))


}