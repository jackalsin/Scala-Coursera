package _4_2_ObjectsEverywhere

/**
  *
  * @author jacka
  * @version 1.0 on 6/1/2016.
  */
object Zero extends Nat{
  override def isZero: Boolean = true

  override def successor: Nat = new Succ(this)

  override def +(that: Nat): Nat = that

  override def -(that: Nat): Nat = throw new NoSuchElementException("Nil.")

  override def predecessor: Nat = throw new NoSuchElementException("Zero.predecessor")
}
