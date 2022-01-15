object Main extends App {
    val ints = List.range(1, 10)
    println(ints)
    println()

    val ints2 = List(1, 2, 3)
    val doubleInts = ints.map(_ * 2)
    println(doubleInts)
    println()

    val ints3 = List.range(1, 10)
    println(ints.filter(_ > 5))
    println(ints.filter(_ < 5))
    println(ints.filter(_ % 2 == 0))
}
