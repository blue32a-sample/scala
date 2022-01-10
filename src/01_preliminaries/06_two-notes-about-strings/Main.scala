object Main extends App {
    val firstName = "John"
    val mi = 'C'
    val lastName = "Doe"
    println("Name: " + firstName + " " + mi + " " + lastName)
    println(s"Name: $firstName $mi $lastName")
    println(s"Name: ${firstName} ${mi} ${lastName}")
    println()

    println(s"1+1 = ${1+1}")
    println()

    val speech = """Four score and
               seven years ago
               our fathers ..."""
    println(speech)

    val speech2 = """Four score and
               |seven years ago
               |our fathers ...""".stripMargin
    println(speech2)
}
