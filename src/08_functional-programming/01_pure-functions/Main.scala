object Main extends App {
    def double(i: Int): Int = i * 2
    println(double(2))

    def sum(list: List[Int]): Int = list match {
        case Nil => 0
        case head :: tail => head + sum(tail)
    }
    val nums = List(1, 2, 3, 4, 5)
    println(sum(nums))
}
