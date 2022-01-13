trait TailWagger {
    def startTail(): Unit
    def stopTail(): Unit
}

class Dog extends TailWagger {
    def startTail() = println("tail is wagging")
    def stopTail() = println("tail is stopped")
}

object Single extends App {
    val d = new Dog
    d.startTail()
    d.stopTail()
}
