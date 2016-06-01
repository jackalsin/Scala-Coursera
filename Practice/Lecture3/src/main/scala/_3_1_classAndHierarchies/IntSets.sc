import _3_1_classAndHierarchies.{Empty, IntSet, NonEmpty}

object intsets {
  /* Create an tree like this,
  *             7
  *          3    9
  *       1    5     11
  */
  val x7 = new NonEmpty(7, Empty, Empty)
  val x8 = x7.incl(1)
  /* the x8 will be updated, the x7 will not.*/
  x8


  x7.incl(3)
  x7.incl(11)
  x7.incl(9)
  x7.incl(5)
  x7

}