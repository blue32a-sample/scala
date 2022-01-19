object Main extends App {
    val nums = (1 to 10).toList
    println(nums)

    // 関数を変数として作成でき、他の関数に渡すことができる（高階関数）
    val doubles = nums.map(_ * 2)
    println(doubles)
    val lessThanFive = nums.filter(_ < 5)
    println(lessThanFive)
    println()

    // Function or Method?
    val isEvenVal = (i: Int) => i % 2 == 0   // a function
    def isEvenDef(i: Int) = i % 2 == 0       // a method
    val xs = List(1, 2, 3, 4)
    println(xs.filter(isEvenVal)) // val
    println(xs.filter(isEvenDef)) // def
    println()

    // A few examples
    println(List("foo", "bar").map(_.toUpperCase))
    println(List("foo", "bar").map(_.capitalize))
    println(List("adam", "scott").map(_.length))
    println(List(1, 2, 3, 4, 5).map(_ * 10))
    println(List(1, 2, 3, 4, 5).filter(_ > 2))
    println(List(5, 1, 3, 11, 7).takeWhile(_ < 6))

    def toUpper(s: String): String = s.toUpperCase
    println(List("foo", "bar").map(toUpper))
}
