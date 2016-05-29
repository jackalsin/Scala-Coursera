object exercise {
  /**
    * This function returns a function
    *
    * @param f a function that calculate the sum
    * @return
    */
  def sum(f: Int=>Int): (Int, Int) => Int ={
    def sumF(a: Int, b:Int): Int = {
      if (a > b) 0
      else sumF(a+1,b) + f(a)
    }
    sumF
  }

  sum(x => x*x*x)(1, 3)

  // ------ new abstraction of fact and product
  def mapReduce(f: Int => Int, combine: (Int, Int) => Int, zero: Int)(a: Int, b: Int): Int = {
    if (a > b) zero
    else
      combine(mapReduce(f, combine,zero)(a+1, b), f(a))
  }

  def product(f: Int => Int)(a: Int, b: Int): Int = {
    mapReduce(f, (x, y) => x * y, 1)(a, b)
  }
  product(x => x*x)(3, 4)

  def factorial(n: Int) = {
    product(x => x)(1, n)
  }
  factorial(5)


}