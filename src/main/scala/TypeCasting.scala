def typeCastingRunner(): Unit =
    println("Type Casting")

    val b: Byte = 127
    val i: Int = b
    println(s"i: $i")           // i: 127

    val face: Char = '☺'
    println(s"face: $face")     // face: ☺
    val number: Int = face
    println(s"number: $number") // number: 9786

    // we can only cast to a type if there is no loss of information
    // otherwise, we need to be explicit about the cast
    val x: Long = 987_654_321   // or val x = 987_654_321L
    println(s"x: $x")           // x: 987654321
    val y: Float = x.toFloat    // required cast because it results in precision loss
    println(s"y: $y")           // y: 9.8765434E8

    // Long to Int = required cast
    val lti: Int = x.toInt
    println(s"lti: $lti")       // lti: 987654321

    // val ltiError: Int = x    // Error, required explicit cast

    // Float to Long = required cast
    val z: Long = y.toLong
    println(s"z: $z")           // z: 987654336

    // val zError: Long = y     // Error, required explicit cast
