object Main extends App {
    val b: Byte = 1
    val x: Int = 1
    val l: Long = 1
    val s: Short = 1
    val d: Double = 2.0

    // error: type mismatch
    // val f: Float = 3.0
    val f: Float = 3.0f

    val int = 123 // defaults to Int
    println(int)
    val double = 1.0 // defaults to Double
    println(double)

    var bi = BigInt(1234567890)
    println(bi)
    var bd = BigDecimal(123456.789)
    println(bd)

    val name = "Bill" // defaults to String
    println(name)
    val c = 'a' // defaults to Char
    println(c)
}
