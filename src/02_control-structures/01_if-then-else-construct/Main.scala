object Main extends App {
    val a = 1
    val b = 1

    def doSomething() = println("do something")
    def doSomethingElse() = println("do something else")

    if (a == b) doSomething()

    if (a == b) {
        doSomething()
    } else {
        doSomethingElse()
    }

    val x = 1
    val y = 2
    val minValue = if (x < y) x else y
    println(s"min value: $minValue")
}
