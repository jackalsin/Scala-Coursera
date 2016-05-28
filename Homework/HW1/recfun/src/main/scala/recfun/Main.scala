package recfun

object Main {
  def main(args: Array[String]) {
    println("Pascal's Triangle")
    for (row <- 0 to 10) {
      for (col <- 0 to row)
        print(pascal(col, row) + " ")
      println()
    }
  }

  /**
   * Exercise 1
   */
    def pascal(c: Int, r: Int): Int = {
      if (r == c|| c == 0) 1
      else pascal(c - 1, r - 1) + pascal(c, r - 1)
    }
  
  /**
   * Exercise 2
   */
    def balance(chars: List[Char]): Boolean = {
      def balanceHelper(left: Int, right: Int, chars: List[Char]): Boolean = {
        if (chars.isEmpty) left == right
        else {
          if (chars.head == '(')
            return (left >= right) && balanceHelper(left + 1, right, chars.tail)
          if (chars.head == ')')
            return (left >= right) && balanceHelper(left, right + 1, chars.tail)
          balanceHelper(left, right, chars.tail)
        }
      }
      balanceHelper(0,0,chars)
    }

  /**
   * Exercise 3
   */
    def countChange(money: Int, coins: List[Int]): Int = {
      if (money == 0) return 1
      else if (money < 0 || coins.isEmpty) return 0
      else {
        countChange(money - coins.head, coins) + countChange(money, coins.tail)
      }
    }
  }
