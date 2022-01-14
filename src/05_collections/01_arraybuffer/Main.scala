import scala.collection.mutable.ArrayBuffer

object Main extends App {
    val ints = ArrayBuffer[Int]()
    ints += 1
    ints += 2
    println(ints)
    println()

    val names = ArrayBuffer[String]()
    names += "Jon"
    names += "Alexander"
    println(names)
    println()

    val nums = ArrayBuffer(1, 2, 3)
    println(nums)
    nums += 4
    println(nums)
    nums += 5 += 6
    println(nums)
    nums ++= List(7, 8, 9)
    println(nums)
    nums -= 9
    println(nums)
    nums -= 7 -= 8
    println(nums)
    nums --= Array(5, 6)
    println(nums)
}
