trait Speaker {
    def speak(): String
}

trait TailWagger {
    def startTail(): Unit = println("tail is wagging")
    def stopTail(): Unit = println("tail is stopped")
}

trait Runner {
    def startRunning(): Unit = println("I'm running")
    def stopRunning(): Unit = println("Stopped running")
}

trait Fly {
    def onTheFly(): Unit = println("Mixing traits in on the fly")
}

class Dog(name: String) extends Speaker with TailWagger with Runner {
    def speak(): String = "Woof!"
}

class Cat extends Speaker with TailWagger with Runner {
    def speak(): String = "Meow"
    override def startRunning(): Unit = println("Yeah ... I don't run")
    override def stopRunning(): Unit = println("No need to stop")
}

object Main extends App {
    val d = new Dog("Zeus")
    d.speak()
    d.startTail()
    d.stopTail()
    d.startRunning()
    d.stopRunning()

    println()

    val c = new Cat with Fly
    c.speak()
    c.startTail()
    c.stopTail()
    c.startRunning()
    c.stopRunning()
    c.onTheFly()
}
