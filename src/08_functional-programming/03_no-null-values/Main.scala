object Main extends App {
    // A first example
    def toInt0(s: String): Int = {
        try {
            Integer.parseInt(s.trim)
        } catch {
            case e: Exception => 0
        }
    }
    println(toInt0("1"))   // 1
    println(toInt0("0"))   // 0
    println(toInt0("foo")) // 0
    println()

    // Using Option/Some/None
    def toInt(s: String): Option[Int] = {
        try {
            Some(Integer.parseInt(s.trim))
        } catch {
            case e: Exception => None
        }
    }
    println(toInt("1"))   // Some(1)
    println(toInt("0"))   // Some(0)
    println(toInt("foo")) // None
    println()

    // Being a consumer of toInt
    val x = "2"
    toInt(x) match {
        case Some(i) => println(i)
        case None => println("That didn't work.")
    }

    val y = for {
        a <- toInt("1")
        b <- toInt("2")
        c <- toInt("3")
    } yield a + b + c
    println(y) // Some(6)

    val z = for {
        a <- toInt("1")
        b <- toInt("2")
        c <- toInt("bar")
    } yield a + b + c
    println(z) // None
    println()

    // Using foreach
    toInt("1").foreach(println) // 1
    toInt("x").foreach(println) // prints nothing
    println()

    // Using Option to replace null values
    val santa1 = new Address(
        "1 Main Street",
        None,
        "North Pole",
        "Alaska",
        "99705"
    )
    println(santa1)

    val santa2 = new Address(
        "123 Main Street",
        Some("Apt. 2B"),
        "Talkeetna",
        "Alaska",
        "99676"
    )
    println(santa2)
}

class Address (
    var street1: String,
    // var street2: String,
    var street2: Option[String],
    var city: String,
    var state: String,
    var zip: String
) {
    override def toString(): String = {
        s"""Address:
           |  Street 1: $street1
           |  Street 2: $street2
           |  City    : $city
           |  State   : $state
           |  Zip     : $zip
         """.stripMargin
    }
}
