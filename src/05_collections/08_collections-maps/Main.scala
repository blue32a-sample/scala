object Main extends App {
    // immutable Map
    println("*** immutable Map ***")

    val m = Map(
        1 -> "a",
        2 -> "b",
        3 -> "c",
        4 -> "d"
    )

    for ((k, v) <- m) printf("key: %s, value: %s\n", k, v)
    println()

    println(m.keys)
    println()

    println(m.values)
    println()

    println(m.contains(3))
    println()

    println(m.transform((k, v) => v.toUpperCase))
    println()

    println(m.view.filterKeys(Set(2, 3)).toMap)
    println()

    println(m.take(2))
    println()

    // mutable Map
    println("*** mutable Map ***")

    val states = scala.collection.mutable.Map(
        "AL" -> "Alabama",
        "AK" -> "Alaska"
    )

    println(states += ("AZ" -> "Arizona"))
    println(states ++= Map("CO" -> "Colorad", "KY" -> "Kentucky"))
    println()

    println(states -= "KY")
    println(states --= List("AZ", "CO"))
    println()

    states("AK") = "Alaska, The Big State"
    println(states)
    println()

    println(states.filterInPlace((k, v) => k == "AK"))
}
