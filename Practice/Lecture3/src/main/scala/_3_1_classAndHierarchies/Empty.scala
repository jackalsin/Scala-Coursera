package _3_1_classAndHierarchies

/**
  * Created by jacka on 5/29/2016.
  */
/* Change the "class" to "object" is applying the singleton */
object Empty extends IntSet{
  /**
    * Like the add in the set in Java
    *
    * @param x the element to include
    * @return the new set that include x
    */
  override def incl(x: Int): IntSet = new NonEmpty(x, Empty, Empty)

  /**
    * To tell if x is in the scala
    *
    * @param x element to test
    * @return true if x in the set.
    */
  override def contains(x: Int): Boolean = false

  override def toString = "."

  override def union(that: IntSet): IntSet = that
}
