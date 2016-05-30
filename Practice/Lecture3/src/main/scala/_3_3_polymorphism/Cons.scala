package _3_3_polymorphism

/**
  * Created on 5/30/2016.
  *
  * @author jacka
  * @version 1.0
  */
class Cons[T] (val head:T, val tail: List[T]) extends List[T]{
  override def isEmpty: Boolean = false

  override def tail: List[T] = ???

  override def head: T = ???
}
