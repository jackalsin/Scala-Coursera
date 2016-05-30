package _3_3_polymorphism

/**
  * Created on 5/30/2016.
  *
  * @author jacka
  * @version 1.0
  */
class Nil[T] extends List[T]{
  override def isEmpty: Boolean = true

  override def tail:  Nothing = throw new NoSuchElementException("Nil.tail")

  override def head: Nothing = throw new NoSuchElementException("Nil.head")
}
