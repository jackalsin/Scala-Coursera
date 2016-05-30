package _3_1_classAndHierarchies

/**
  * Created by jacka on 5/29/2016.
  */
abstract class IntSet {
  /**
    * Like the add in the set in Java
    *
    * @param x the element to include
    * @return the new set that include x
    */
  def incl(x: Int): IntSet

  /**
    * To tell if x is in the scala
    * @param x element to test
    * @return true if x in the set.
    */
  def contains(x: Int): Boolean
}
