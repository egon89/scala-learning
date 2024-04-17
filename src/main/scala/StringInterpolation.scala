def stringInterpolation(): Unit =
    println("string interpolation")

    val name = "James"
    val age = 30
    println(s"$name is $age years old")

    val x = -1
    println(s"x.abs = ${x.abs}")        // "x.abs = 1"

    println(s"New offers starting at $$14.99")  // New offers starting at $14.99

    // escaping double quotes
    println(s"""{"name":"James"}""")            // {"name":"James"}

    // the -f interpolator
    // it works like the printf
    val height = 1.9d
    println(f"$name%s is $height%2.2f meters tall") // James is 1.90 meters tall

    // raw interpolator
    // turn expressions into a return character
    println(s"a\nb")    // it prints a in line 1 and b in line 2
    println(raw"a\nb")  // it prints a\nb
