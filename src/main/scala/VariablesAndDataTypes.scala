
def builtInDataTypes(): Unit =
    println("Built-in data types")
    val b: Byte = 1
    val i: Int = 1
    val l: Long = 1
    val s: Short = 1
    val d: Double = 2.0
    val f: Float = 3.0
    val bln: Boolean = true

    val in = 123 // Int type
    val j = 1.0 // Double type

    val longValue = 1_000L // Long
    val doubleValue = 2.2D // Double
    val floatValue = 3.3F // Float

    val bigInt = BigInt(1_234_567_890_987_654_321L)
    val bigDecimal = BigDecimal(123_156.789)

    val firstName = "John"  // String
    val mi = 'C'            // Char
    val lastName = "Doe"    // String

    println(s"Name: $firstName $mi $lastName")

    println(s"2 + 2 = ${2 + 2}")

    val quote = 
    """The essence of Scala:
    Fusion of functional and object-oriented
    programming in a typed setting."""

    println(quote)
