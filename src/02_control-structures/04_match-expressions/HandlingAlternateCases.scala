object HandlingAlternateCases extends App {
    def isTrue(a: Any) = a match {
        case 0 | "" => false
        case _ => true
    }

    println("0 is " + isTrue(0))
    println("balnk is " + isTrue(""))
    println("1.1F is " + isTrue(1.1F))

    val i = 3
    val evenOrOdd = i match {
        case 1 | 3 | 5 | 7 | 9 => println("odd")
        case 2 | 4 | 6 | 8 | 10 => println("even")
        case _ => println("some other number")
    }

    val cmd = "exit"
    cmd match {
        case "start" | "go" => println("starting")
        case "stop" | "quit" | "exit" => println("stopping")
        case _ => println("doing nothing")
    }
}
