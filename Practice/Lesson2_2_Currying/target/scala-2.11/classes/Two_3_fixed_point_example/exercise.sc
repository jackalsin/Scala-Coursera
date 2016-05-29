import math.abs

object exercise {
  def isCloseEnough(a: Double, b: Double) = {
    abs((b - a) / a) < 1e-4
  }

  def fixPoint(f: Double => Double)(firstGuess: Double): Double = {
    println("First guess = " + firstGuess)
    if (isCloseEnough(firstGuess, f(firstGuess))) firstGuess
    else fixPoint(f)(f(firstGuess))
  }

  fixPoint(x => x / 2 + 1)(1.2)

  // the square root is fix point x = y / x

  /*
  def sqrt(x: Int) = fixPoint(y => x / y)(1.0)
  sqrt(3)
  */

  /* new version */
  def sqrt(x: Int) = fixPoint(y => (x / y + x)/2)(1.0)
  sqrt(3)

  def averageDamp(f: Double => Double)(x: Double) = {
    (x + f(x)) /2
  }

  def sqrt3(x: Int) = fixPoint(averageDamp(y => x/y))(1.0)
  sqrt3(2)
}