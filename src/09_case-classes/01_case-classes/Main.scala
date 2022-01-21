object Main extends App {
    // newキーワードは不要
    val christina = Person("Christina", "niece")

    // パラメータごとにアクセサーメソッドが生成される
    println(christina.name)
    println(christina.relation)

    // ミューテータメソッドは生成されない
    // christina.name = "Fred" // error: reassignment to val

    // クラスのunapplyメソッドが自動的に生成される
    def getPrintableString(p: PersonTrait): String = p match {
        case Student(name, year) =>
            s"$name is a student in Year $year."
        case Teacher(name, whatTheyTeach) =>
            s"$name teaches $whatTheyTeach."
    }

    val s = Student("Al", 1)
    val t = Teacher("Bob Donnan", "Mathematics")
    println(getPrintableString(s))
    println(getPrintableString(t))

    // copy
    val cubs1908 = BaseballTeam("Chicago Cubs", 1908)
    println(s"${cubs1908.name} ${cubs1908.lastWorldSeriesWin}")
    val cubs2016 = cubs1908.copy(lastWorldSeriesWin = 2016)
    println(s"${cubs2016.name} ${cubs2016.lastWorldSeriesWin}")

    // 自動生成されたequalsやhashCodeメソッドがあるため、インスタンスを比較でき
    val hannah = Person("Hannah", "niece")
    println(christina == hannah)

    // デフォルトのtoStringメソッド
    println(christina)
}

case class Person(name: String, relation: String)

trait PersonTrait {
    def name: String
}
case class Student(name: String, year: Int) extends PersonTrait
case class Teacher(name: String, specialty: String) extends PersonTrait

case class BaseballTeam(name: String, lastWorldSeriesWin: Int)
