package _4_2_ObjectsEverywhere

/**
  * This is a class for not negative integers.
  *
  * @author jacka
  * @version 1.0
  */
abstract class Nat {
  def isZero: Boolean
  def predecessor: Nat
  def successor: Nat
  def + (that: Nat): Nat
  def - (that: Nat): Nat
}
