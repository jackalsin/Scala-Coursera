object Hiera {
  def error(msg: String) = throw new Error(msg)

  println("before Error msg")

  error("It should end here")

  println("After Error msg")
}