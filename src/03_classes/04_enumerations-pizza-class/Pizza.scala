import scala.collection.mutable.ArrayBuffer

sealed trait Topping
case object Cheese extends Topping
case object Pepperoni extends Topping
case object Sausage extends Topping
case object Mushrooms extends Topping
case object Onions extends Topping

sealed trait CrustSize
case object SmallCrustSize extends CrustSize
case object MediumCrustSize extends CrustSize
case object LargeCrustSize extends CrustSize

sealed trait CrustType
case object RegularCrustType extends CrustType
case object ThinCrustType extends CrustType
case object ThickCrustType extends CrustType

class Pizza (
    var crustSize: CrustSize = MediumCrustSize,
    var crustType: CrustType = RegularCrustType
) {
    val toppings = ArrayBuffer[Topping]()

    def addTopping(t: Topping): Unit = toppings += t
    def removeTopping(t: Topping): Unit = toppings -= t
    def removeAllToppings(): Unit = toppings.clear()

    override def toString(): String = {
        s"""
        |Crust Size: $crustSize
        |Crust Type: $crustType
        |Toppings:   $toppings
        """.stripMargin
    }
}

object PizzaTest extends App {
    val p1 = new Pizza
    p1.addTopping(Cheese)
    p1.addTopping(Pepperoni)
    println(p1)

    val p2 = new Pizza(SmallCrustSize, ThinCrustType)
    p2.addTopping(Cheese)
    p2.addTopping(Onions)
    p2.removeTopping(Onions)
    p2.addTopping(Mushrooms)
    println(p2)

    val p3 = new Pizza(LargeCrustSize)
    p3.addTopping(Sausage)
    p3.addTopping(Onions)
    p3.removeAllToppings()
    p3.addTopping(Cheese)
    println(p3)
}
