import scala.math.*

// collection of utility methods
object StringUtils:
    def isNullOrEmpty(s: String): Boolean = s == null || s.trim.isEmpty
    def leftTrim(s: String): String = s.replaceAll("^\\s+", "")
    def rightTrim(s: String): String = s.replaceAll("\\s+$", "")

// companion object
class MyClass(private val value: Int):
    def getValue: Int = value

object MyClass:
    def createWithValue(value: Int): MyClass =
        new MyClass(value)
    
    val default: MyClass = new MyClass(0)


class Circle(private val radius: Double):
    // accessing the private method of the companion object
    def area: Double = Circle.calculateArea(radius)

object Circle:
    private def calculateArea(radius: Double): Double =
        Pi * pow(radius, 2.0)


class MathUtils private () // private constructor

object MathUtils:
    def add(x: Int, y: Int): Int = x + y
    def subtract(x: Int, y: Int): Int = x - y


// creating modules from traits
trait AddService:
    def add(a: Int, b: Int) = a + b

trait MultiplyService:
    def multiply(a: Int, b: Int) = a * b

object MathService extends AddService, MultiplyService


def singletonObjectsRunner(): Unit =
    println("singleton objects runner")

    // Utility methods
    println(StringUtils.isNullOrEmpty("a")) // false
    println(StringUtils.isNullOrEmpty(""))  // true
    println(StringUtils.isNullOrEmpty(" ")) // true

    val name = StringUtils.leftTrim("    Name")
    val surname = StringUtils.rightTrim("Surname    ")
    println(s"Hello $name $surname!") // Hello Name Surname!

    // Companion objects
    // factory method
    println(MyClass.createWithValue(10).getValue)   // 10
    println(MyClass.default.getValue)               // 0

    // circle
    val circle1 = Circle(5.0)           // don't need the new keyword
    println(circle1.area)

    // Circle.calculateArea(2)          // we cannot access the private static method

    // val mathUtils = new MathUtils()  // we cannot instantiate with a private constructor
    // accessing the static methods
    println(MathUtils.add(5, 5))        // 10
    println(MathUtils.subtract(10, 2))  // 8

    // create modules from traits
    println(MathService.add(10, 2))     // 12
    println(MathService.multiply(2, 2)) // 4
    