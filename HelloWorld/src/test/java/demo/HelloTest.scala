package demo

import org.scalatest.FunSuite

/**
  * Created by jacka on 5/27/2016.
  */
class HelloTest extends FunSuite {
  test("sayHello method works correctly") {
    val hello = new Hello
    assert(hello.sayHello("Scala") == "Hello, Scala!")
  }
}
