object session {
  1+2



  def sqrt(x: Double) = {
    def abs(x:Double) = if (x<0) -x else x

    def sqrtIter(guess: Double): Double =
      if (isGoodEnough(guess)) guess
      else sqrtIter(improve(guess))

    def isGoodEnough(guess: Double) = abs(x - guess * guess) <= 0.01 * x

    def improve(guess: Double) =
      (guess + x / guess) / 2
    sqrtIter(1.0)
  }

  sqrt(1)
  sqrt(4)
  sqrt(1e-6)
  sqrt(1e60)

}