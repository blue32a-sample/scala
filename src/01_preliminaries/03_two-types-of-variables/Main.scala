object Main extends App {
    val s: String = "hello" // immutable
    println("s = " + s)

    // error: reassignment to val
    // s = "world"

    var i: Int = 42 // mutable
    println("i = " + i)
    i = 53
    println("i = " + i)

    val p: Person = new Person("Joel Fleischman")
}

class Person(var name: String) {
}
