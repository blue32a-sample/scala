object Main extends App {
    val count = 1
    println("count = " + count)

    val name = "Alvin"
    println("name = " + name)

    val p = new Person("Joel Fleischman")
    println("p = " + p)
}

class Person(var name: String) {
}
