object Main extends App {
    def double(a: Int) = a * 2
    println(double(2))
    println(double(5))

    def add(a: Int, b: Int): Int = a + b
    println(s"1 + 2 = ${add(1, 2)}")
    println(s"3 + 6 = ${add(3, 6)}")

    def addThenDouble(a: Int, b: Int): Int = {
        val sum = a + b
        val doubled = sum * 2
        doubled
    }
    println(addThenDouble(1, 2))
    println(addThenDouble(3, 6))
}
