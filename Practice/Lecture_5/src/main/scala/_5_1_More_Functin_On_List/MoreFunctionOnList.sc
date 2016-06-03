object MoreFunctionOnList {
  def last[T](xs: List[T]): T = xs match {
    case List() => throw new Error("last of empty list")
    case List(x) => x
    case y :: ys => last(ys)

  }
  val s = List (1, 2 ,3, 4, 5)
  last[Int](s)


  def init[T](xs: List[T]): List[T] = xs match {
    case List() => throw new Error("last of empty list")
    case List(x) =>  List()
    case y :: ys => y +: init(ys)
  }
  init[Int](s)

  val t = List(22, 222,2222)
  t:::s
  def concat[T](xs: List[T], ys: List[T]): List[T] = xs match {
    case List() => ys
    case z:: zs => z :: concat(zs, ys)
  }

  concat(s, t)

  def reverse[T](xs: List[T]): List[T] = xs match {
    case List() => List()
    case y :: ys => reverse(ys) :+ y
  }

  reverse(s)


  def removeAt[T](n:Int, xs: List[T]): List[T] = {
    def removeHelper(index: Int, prev: List[T], append: List[T]): List[T] = {
      index match {
        case (0) => prev ++ append.tail// find element
        case (_) => removeHelper(index - 1, prev :+ append.head, append.tail)
      }

    } // end of help function
    removeHelper(n, List(), xs)
  }

  removeAt(1, s)
  def removeAt(n: Int, xs: List[Int]) = (xs take n) ::: (xs drop (n+1))
}