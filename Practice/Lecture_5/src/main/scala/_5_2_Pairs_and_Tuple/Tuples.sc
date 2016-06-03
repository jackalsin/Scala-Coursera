object Tuples {
  def mergeSort(xs: List[Int]): List[Int] = {
    val n = xs.length / 2
    if (n == 0) xs
    else {
      def merge(xs: List[Int], ys: List[Int]): List[Int] = {
        xs match {
          case Nil => ys
          case x:: xsl => {
            ys match {
              case Nil => xs
              case y :: ysl => {
                if (x < y) x :: merge(xsl, ys)
                else  y:: merge(xs, ysl)
              }
            } // end of ys match
          }
        }
      }
      val (fst, snd) = xs splitAt n
      merge(mergeSort(fst), mergeSort(snd))
    }
  } // end of define merge sort

  
}