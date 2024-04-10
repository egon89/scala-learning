def printer(a: Any): Unit = println(a)

def scalaTypeHierarchyRunner(): Unit =
    println("> Scala type hierarchy")
    // each value is an instance of Any
    val list: List[Any] = List(
        "a string",
        732,    // an integer
        'c',    // a character
        '\'',   // a character with a backslash escape
        true,   // a boolean value
        () => "an anonymous function returning a string"
    )

    list.foreach(element => println(element))
    println()
    list.foreach(println(_))
    println()
    list.foreach(element => printer(element))
    println()
    list.foreach(printer(_))
