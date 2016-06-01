package _4_5_Decomposition

/**
  *
  * @author jacka
  * @version 1.0 on 6/1/2016.
  */
trait Expr {
  def isNumber: Boolean
  def isSum: Boolean
  def numValue: Int
  def leftOp: Expr
  def rightOp: Expr
}
