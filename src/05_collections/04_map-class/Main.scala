import scala.collection.mutable.Map

object Main extends App {
    val states = collection.mutable.Map("AK" -> "Alaska")
    println(states)
    states += ("AL" -> "Alabama")
    println(states)

    // deprecated
    states += ("AR" -> "Arkansas", "AZ" -> "Arizona")
    println(states)

    states ++= Map("CA" -> "California", "CO" -> "Colorado")
    println(states)
    println()

    states -= "AR"
    println(states)

    // deprecated
    states -= ("AL", "AZ")
    println(states)

    states --= List("CA", "CO")
    println(states)
    println()

    states("AK") = "Alaska, A Really Big State"
    println(states)
    println()

    val ratings = Map(
        "Lady in the Water"-> 3.0,
        "Snakes on a Plane"-> 4.0,
        "You, Me and Dupree"-> 3.5
    )
    for ((k, v) <- ratings) println(s"key: $k, value: $v")

    ratings.foreach {
        case(movie, rating) => println(s"key: $movie, value: $rating")
    }
}
