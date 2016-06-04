object selfObj {

  val listOfList = List(List(("a", 3), ("c",5)),
                         List(("d",1), ("c",4))
                        )
  for {
    i <- 1 to 3
  } yield listOfList flatMap (("x", 1) :: _)

  for {
    i <- 1 to 3
    child <- listOfList
  } yield ("x", 1) :: child

  val listNumber = List(3, 4, 5)

  for {
    i <- 1 to 3
  } yield listNumber map (_ + i)


  val ayerList = List(List(List(2, 3)), List(3,3))

  ayerList.flatten
}