package _4_2_ObjectsEverywhere

/**
  *
  * @author jacka
  * @version 1.0 on 6/1/2016.
  */
class Succ(val x: Nat) extends Nat{
  override def isZero: Boolean = false

  override def successor: Nat = new Succ(this)

  override def +(that: Nat): Nat = new Succ(x + that)

  override def -(that: Nat): Nat = {
    if (that.isZero) Zero
    else
      predecessor - that.predecessor
  }

  override def predecessor: Nat = x
}
