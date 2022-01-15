import scala.collection.mutable.Set

object Main extends App {
    val set = Set[Int]()
    println(set)
    set += 1
    println(set)
    set += 2 += 3
    println(set)
    set ++= Vector(4, 5)
    println(set)
    set += 2
    println(set)
    println(set.add(3))
    println(set)
    println()

    val set2 = Set(1, 2, 3, 4, 5)
    set2 -= 1
    println(set2)

    // deprecated
    set2 -= (2, 3)

    println(set2)
    set2 --= Array(4, 5)
    println(set2)
    println()

    val set3 = Set(1, 2, 3, 4, 5)
    set3.clear()
    println(set3)
    println()

    val set4 = Set(1, 2, 3, 4, 5)
    println(set4.remove(2))
    println(set4)
    println(set4.remove(40))
}
