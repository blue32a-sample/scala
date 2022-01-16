object Main extends App {
    val nums = (1 to 10).toList
    println(nums)
    val names = List("joel", "ed", "chris", "maurice")
    println(names)
    println()

    // map
    println("map")
    println(nums.map(_ * 2))
    println(nums.map(_ < 5))
    println(names.map(_.capitalize))
    println()

    // filter
    println("filter")
    println(nums.filter(_ < 5))
    println(nums.filter(_ % 2 == 0))
    println(names.filter(_.length <= 4))
    println()

    // foreach
    println("foreach")
    names.foreach(println)
    nums.filter(_ < 4).foreach(println)
    println()

    // head
    println("head")
    println(nums.head)
    println(names.head)
    println("foo".head)
    println()

    // tail
    println("tail")
    println(nums.tail)
    println(names.tail)
    println("foo".tail)
    println()

    // take
    println("take")
    println(nums.take(1))
    println(nums.take(2))
    println(names.take(1))
    println(names.take(2))
    println()

    // takeWhile
    println("takeWhile")
    println(nums.takeWhile(_ < 5))
    println(names.takeWhile(_.length < 5))
    println()

    // drop
    println("drop")
    println(nums.drop(1))
    println(nums.drop(5))
    println(names.drop(1))
    println(names.drop(2))
    println()

    // dropWhile
    println("dropWhile")
    println(nums.dropWhile(_ < 5))
    println(names.dropWhile(_ != "chris"))
    println()

    // reduce
    println("reduce")
    def add(x: Int, y: Int): Int = {
        val theSum = x + y
        println(s"received $x and $y, their sum is $theSum")
        theSum
    }
    val a = List(1, 2, 3, 4)
    println(a.reduce(add))
    println()
}
