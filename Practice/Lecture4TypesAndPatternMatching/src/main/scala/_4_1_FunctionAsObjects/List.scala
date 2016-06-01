package _4_1_FunctionAsObjects

/**
  * Created on 5/31/2016.
  *
  * @author jacka
  * @version 1.0
  */
trait List[T] {
  def isEmpty: Boolean
  def head: T
  def tail: List[T]

}

class Cons[T](val head: T, val tail: List[T]) extends List[T] {
  override def isEmpty: Boolean = false
}

class  Nil[T] extends List[T] {
  override def isEmpty: Boolean = true

  override def tail: List[T] = throw new NoSuchElementException("Nil.tail")

  override def head: Nothing = throw new NoSuchElementException("Nil.head")
}