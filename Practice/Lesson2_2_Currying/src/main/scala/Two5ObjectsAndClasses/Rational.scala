package Two5ObjectsAndClasses

/**
  * Created by jacka on 5/29/2016.
  */
case class Rational(x: Int, y: Int) {
  require(denom> 0, "Denominator cannot be zero")

  /**
    * The alternative constructor
    * @param y the integer
    * @return a Rational Integer
    */
  def this (y: Int) = this(y, 1)
  def numer = x

  def denom = y

  def add(that: Rational) = new Rational(
    numer * that.denom + that.numer * that.denom, denom * that.denom
  )

  def neg = new Rational(- numer, denom)

  def sub(that: Rational) = add(that.neg)

  override def toString = numer + "/" + denom

}
