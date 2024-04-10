def stringsRunner(): Unit =
    println("String")

    val indentedQuote = """The essence of Scala:
    Fusion of functional and object-oriented
    programming in a typed setting."""
    
    println("# indentedQuote")
    println(indentedQuote)

    val quote1 = """The essence of Scala:
    |Fusion of functional and object-oriented
    |programming in a typed setting.""".stripMargin

    println("# quote1")
    println(quote1)

    val quote2 = """
    |The essence of Scala:
    |Fusion of functional and object-oriented
    |programming in a typed setting.""".stripMargin

    println("# quote2")
    println(quote2)
