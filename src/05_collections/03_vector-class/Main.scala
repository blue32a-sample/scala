object Main extends App {
    val nums = Vector(1, 2, 3, 4, 5)
    println(nums)
    val strings = Vector("one", "two")
    println(strings)
    println()
    val a = Vector(1, 2, 3)
    val b = a :+ 4
    println(b)
    val c = a ++ Vector(4, 5)
    println(c)
    val d = 0 +: a
    println(d)
    val e = Vector(-1, 0) ++: a
    println(e)
    println()
    val names = Vector("Joel", "Chris", "Ed")
    for (name <- names) println(name)
}
