package _4_5_Decomposition

/**
  *
  * @author jacka
  * @version 1.0 on 6/1/2016.
  */
class Sum (e1: Expr, e2: Expr) extends Expr {
  override def isNumber: Boolean = false

  override def rightOp: Expr = e2

  override def numValue: Int = throw new Error("Sum.value")

  override def isSum: Boolean = true

  override def leftOp: Expr = e1
}
