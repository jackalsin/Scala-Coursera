package _3_3_polymorphism

/**
  * Created on 5/30/2016.
  *
  * @author jacka
  * @version 1.0
  */
trait List[T] {
  def isEmpty: Boolean
  def head: T
  def tail: List[T]
}
