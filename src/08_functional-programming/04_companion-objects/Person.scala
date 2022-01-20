class Person {
    var name: Option[String] = None
    var age: Option[Int] = None
    override def toString = s"$name, $age"
}

object Person {
    def apply(name: Option[String]): Person = {
        var p = new Person
        p.name = name
        p
    }

    def apply(name: Option[String], age: Option[Int]): Person = {
        var p = new Person
        p.name = name
        p.age = age
        p
    }

    def unapply(p: Person): Tuple2[Option[String], Option[Int]] = (p.name, p.age)
}

object Main extends App {
    val p1 = Person(Some("Fred"))
    println(p1)
    val p2 = Person(None)
    println(p2)
    val p3 = Person(Some("Wilma"), Some(33))
    println(p3)
    val p4 = Person(Some("Wilma"), None)
    println(p4)

    val p5 = Person(Some("Lori"), Some(29))
    val (name, age) = Person.unapply(p5)
    println(name)
    println(age)
}
