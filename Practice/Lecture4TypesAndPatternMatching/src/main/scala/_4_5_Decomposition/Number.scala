package _4_5_Decomposition

/**
  *
  * @author jacka
  * @version 1.0 on 6/1/2016.
  */
class Number(n: Int) extends Expr {
  override def isNumber: Boolean = true

  override def rightOp: Expr = throw new Error("No right op")

  override def numValue: Int = n

  override def isSum: Boolean = false

  override def leftOp: Expr = throw new Error("No left op")
}
