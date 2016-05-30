package _3_1_classAndHierarchies

/**
  * Created by jacka on 5/29/2016.
  */
class NonEmpty (elem: Int, left: IntSet, right: IntSet) extends IntSet{
  /**
    * Like the add in the set in Java
    *
    * @param x the element to include
    * @return the new set that include x
    */
  override def incl(x: Int): IntSet = {
    if (x < elem) new NonEmpty(elem, left incl x, right)
    else if (x > elem) new NonEmpty(elem, left, right incl x)
    else this
  }

  /**
    * To tell if x is in the scala
    *
    * @param x element to test
    * @return true if x in the set.
    */
  override def contains(x: Int): Boolean = {
    if (x < elem) left.contains(x)
    else if (x > elem) right contains x
    else true
  }

  /* This is recursively calling the toString method */
  override def toString = "{" + left + elem + right + "}"

  override def union(that: IntSet): IntSet = {
    ((left union right) union that) incl elem
  }
}
