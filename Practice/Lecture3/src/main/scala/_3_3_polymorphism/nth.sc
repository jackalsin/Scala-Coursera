object nth {
  def nth[T](n: Int, xs: List[T]): T = {
    if (xs.isEmpty) throw new IndexOutOfBoundsException
    if (n ==0) xs.head
    else nth(n-1, xs.tail)
  }



}