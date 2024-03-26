
// collection of utility methods
object StringUtils:
    def isNullOrEmpty(s: String): Boolean = s == null || s.trim.isEmpty
    def leftTrim(s: String): String = s.replaceAll("^\\s+", "")
    def rightTrim(s: String): String = s.replaceAll("\\s+$", "")


def singletonObjectsRunner(): Unit =
    println("singleton objects runner")

    // Utility methods
    println(StringUtils.isNullOrEmpty("a")) // false
    println(StringUtils.isNullOrEmpty(""))  // true
    println(StringUtils.isNullOrEmpty(" ")) // true

    val name = StringUtils.leftTrim("    Name")
    val surname = StringUtils.rightTrim("Surname    ")
    println(s"Hello $name $surname!") // Hello Name Surname!
