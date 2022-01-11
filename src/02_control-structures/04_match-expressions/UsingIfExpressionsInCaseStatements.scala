object UsingIfExpressionsInCaseStatements extends App {
    val count = 5
    count match {
        case 1 =>
            println("one, a lonely number")
        case x if (x == 2 || x == 3) =>
            println("two's company, three's a crowd")
        case x if (x > 3) =>
            println("4+, that's a party")
        case _ =>
            println("i'm guessing your namuber is zero or less")
    }

    val i = 8
    i match {
        case a if 0 to 9 contains a => println("0-9 range: " + a)
        case b if 10 to 19 contains b => println("10-19 range: " + b)
        case c if 20 to 29 contains c => println("20-29 range: " + c)
        case _ => println("Hmmm...")
    }

    val stock = new Stock("XYZ", 60)
    stock match {
        case x if (x.symbol == "XYZ" && x.price < 20) => println("buy")
        case x if (x.symbol == "XYZ" && x.price > 50) => println("sell")
        case x => println("do nothing")
    }
}

class Stock(var symbol: String, var price: Int) {
}
