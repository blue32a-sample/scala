object Main extends App {
    val p = new Person("Bill", "Panner")
    println(p.firstName + " " + p.lastName)

    val pizza = new Pizza(20, "pan style")
    println(s"${pizza.crustSizre} ${pizza.crustType}")

    val stock = new Stock("SPY", 100.11)
    println(s"${stock.symbal} ${stock.price}")

    val socket = new Socket(10, 2)

    val address = new Address("マンハッタン区5番街", "350号", "ニューヨーク市", "ニューヨーク州")
    println(s"${address.street1}${address.street2}, ${address.city}, ${address.state}")
}

class Person(var firstName: String, val lastName: String) {
    println("the constructor begins")

    var age = 23

    private val HOME = "home"

    override def toString(): String = s"$firstName $lastName is $age years old"

    def printHome(): Unit = println(s"Home = $HOME")
    def printFullName(): Unit = println(this)

    printHome()
    printFullName()
    println("you've reached the end of the constructor")
}

class Pizza (var crustSizre: Int, var crustType: String)

class Stock(var symbal: String, var price: BigDecimal)

class Socket(val timeout: Int, val linger: Int) {
    override def toString = s"timeout: $timeout, linger: $linger"
}

class Address (
    var street1: String,
    var street2: String,
    var city: String,
    var state: String
)
