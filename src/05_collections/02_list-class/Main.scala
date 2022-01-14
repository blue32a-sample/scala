object Main extends App {
    val ints = List(1, 2, 3)
    println(ints)
    println()

    val a = List(1, 2, 3)
    val b = 0 +: a
    println(b)
    val c = List(-1, 0) ++: a
    println(c)
    println()

    val names = List("Joel", "Chris", "Ed")
    println(names)
    for (name <- names) println(name)
    println()

    val list = 1 :: 2 :: 3 :: Nil
    println(list)
}
