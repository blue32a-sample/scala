trait Speaker {
    def speak(): String
}

trait TailWagger {
    def startTail(): Unit
    def stopTail(): Unit
}

trait Runner {
    def startRunning(): Unit
    def stopRunning(): Unit
}

class Dog extends Speaker with TailWagger with Runner {
    // Speaker
    def speak(): String = "Woof!"

    // TailWagger
    def startTail(): Unit = println("tail is wagging")
    def stopTail(): Unit = println("tail is stopped")

    // Runner
    def startRunning(): Unit = println("I'm runnig")
    def stopRunning(): Unit = println("Stopped running")
}

object Multiple extends App {
    val d = new Dog
    println(d.speak())
    d.startTail()
    d.stopTail()
    d.startRunning()
    d.stopRunning()
}
