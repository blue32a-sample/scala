object Main extends App {
    val p1 = new Pizza(12, "THIN")
    println(p1)
    val p2 = new Pizza(12)
    println(p2)
    val p3 = new Pizza("THIN")
    println(p3)
    val p4 = new Pizza
    println(p4)
}

class Pizza (var crustSize: Int, var crustType: String) {
    def this(crustSize: Int) = {
        this(crustSize, "THIN")
    }

    def this(crustType: String) = {
        this(12, crustType)
    }

    def this() = {
        this(12, "THIN")
    }

    override def toString = s"A $crustSize inch pizza with a $crustType crust"
}
