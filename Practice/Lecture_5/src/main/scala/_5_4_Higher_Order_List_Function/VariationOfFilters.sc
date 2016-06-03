object variation {
  val nums = List(2, -4, 5, 7, 1)
  val fruits =List("apple", "pineapple", "orange", "bananas")

  nums filter (x => x>0)
  nums filterNot (x => x>0)

  nums partition (x => x>0)
  /* res2: (List[Int], List[Int]) = (List(2, 5, 7, 1),List(-4))
   */

  nums takeWhile (x => x>0)
  nums dropWhile  (x => x>0)
  nums span (x => x>0)

  val data = List("a", "a", "a", "b","b", "c","c","a")
  def pack[T](xs: List[T]): List[List[T]] = xs match {
    case Nil => Nil
    case x:: xsl =>
      val (first, second) = xs span (y => y == x)
      first :: pack(second)
  }

  pack(data)

  def encode[T](xs: List[T]): List[(T, Int)] = xs match {
    case Nil => Nil
    case x::xsl =>
      val s = pack(xs)
      s.map(sChild => (sChild.head, sChild.length))
  }

  encode(data)
}