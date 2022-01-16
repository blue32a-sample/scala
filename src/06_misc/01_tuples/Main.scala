object Main extends App {
    val d = ("Maggie", 30)
    println(d)
    println()

    val t = (3, "Three", new Person("David"))
    println(t)
    println(t._1)
    println(t._2)
    println(t._3)
    println()

    val(x, y, z) = (3, "Three", new Person("David"))
    println(x)
    println(y)
    println(z)
    println()

    def getStockInfo = {
        ("NFLX", 100.00, 101.00)
    }

    val (symbol, currentPrice, bidPrice) = getStockInfo
    println(symbol)
    println(currentPrice)
    println(bidPrice)
}

class Person(var name: String)
