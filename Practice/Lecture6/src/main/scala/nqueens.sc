object nqueens {
  def queens(n: Int): Set[List[Int]] = {
    def placeQueen(k: Int): Set[List[Int]] = {
      if (k==0) Set(List())
      else
        for {
          /* This is looping every element */
          queens <- placeQueen(k - 1)
          col <- 0 until n
          if isSafe(col, queens)
        } yield col :: queens

    }
    placeQueen(n)
  }
  def isSafe(col: Int, queens: List[Int]): Boolean = {
    val row = queens.length
    val queensWithRow = (row - 1 to 0 by -1) zip queens
    queensWithRow forall {
      case (r, c) => col != c && math.abs(col - c) != row - r
    }
  }

  queens(4)


  val rows = List(0, 1, 2, 3)
  val cols = List(0, 1, 2, 3)
  for {
    row <- rows
    col <- cols
  } yield println("row = " + row + " col = " + col)
}