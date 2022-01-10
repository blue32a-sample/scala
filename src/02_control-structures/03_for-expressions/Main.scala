object Main extends App {
    val nums = Seq(1, 2, 3)
    println(nums)
    val doubledNums = for (n <- nums) yield n * 2
    println(doubledNums)
    println()

    val names = List("adam", "david", "frank")
    println(names)
    val ucNames = for (name <- names) yield name.capitalize
    println(ucNames)
    println()

    val names2 = List("_adam", "_david", "_frank")
    println(names2)
    val capNames = for (name <- names2) yield {
        val nameWithoutUnderscore = name.drop(1)
        val capName = nameWithoutUnderscore.capitalize
        capName
    }
    println(capNames)
    val capNames2 = for (name <- names2) yield name.drop(1).capitalize
    println(capNames2)
}
