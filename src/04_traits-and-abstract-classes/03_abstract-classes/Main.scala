abstract class Pet(name: String) {
    def speak(): Unit = println("Yo")
    def speakName(): Unit = println(s"My name is $name")
    def comeToMaster(): Unit
}

class Dog(name: String) extends Pet(name) {
    override def speak() = println("Woof")
    def comeToMaster() = println("Here I come!")
}

object Main extends App {
    val d = new Dog("Fido")
    d.speak()
    d.speakName()
    d.comeToMaster()
}
