import scala.util.{Try,Success,Failure}

object Main extends App {
    // Option/Some/None
    def toInt(s: String): Option[Int] = {
        try {
            Some(Integer.parseInt(s.trim))
        } catch {
            case e: Exception => None
        }
    }

    val x = "foo"
    toInt(x) match {
        case Some(i) => println(i)
        case None => println("That didn't, work.")
    }

    val y = for {
        a <- toInt("1")
        b <- toInt("2")
        c <- toInt("bar")
    } yield a + b + c
    println(y)

    // Try/Success/Failure
    def toInt2(s: String): Try[Int] = Try {
        Integer.parseInt(s.trim)
    }
    val a = toInt2("1")
    println(a)
    val b = toInt2("boo")
    println(b)

    val x2 = "foo"
    toInt2(x2) match {
        case Success(i) => println(i)
        case Failure(s) => println(s"Failed. Reason: $s")
    }

    val y2 = for {
        a <- toInt2("1")
        b <- toInt2("2")
        c <- toInt2("bar")
    } yield a + b + c
    println(y2)
}
