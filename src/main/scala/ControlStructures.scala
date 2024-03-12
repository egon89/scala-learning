
@main def controlStructures(): Unit =
    println("# if/else")
    val x = 0
    if x < 0 then
        println("negative")
    else if x == 0 then
        println("zero")
    else
        println("positive")
    // The control structures can be used as expressions.
    // An expression returns a result.
    val a1 = 10
    val a2 = 5
    val conditionalResult = if a1 < a2 then a1 else a2
    println(s"should return 5: $conditionalResult")

    println("# for loops and expressions")
    val ints = List(1, 2, 3, 4, 5)
    for i <- ints do println(i)

    println("## guards")
    // prints all number in ints that are greater than 2
    for
        i <- ints
        if i > 2
    do
        println(i)
    
    println()
    // we can have multiple generators i <- variable and guards
    for
        i <- 1 to 3
        j <- 'a' to 'c'
        if i == 2
        if j == 'b'
    do
        // prints: i = 2, j = b
        println(s"i = $i, j = $j")
    
    println("yield the result")
    val doubleIt = for i <- ints yield i * 2
    println(doubleIt) // prints List(2, 4, 6, 8, 10)

    val names = List("chris", "ed", "maurice")
    val capNames = for name <- names yield name.capitalize
    println(s"capNames: $capNames")

    val fruits = List("apple", "banana", "lime", "orange")
    val fruitLengths =
        for
            f <- fruits
            if f.length > 4
        yield
            println(f)
            f.length
    
    println(s"fruitLengths: $fruitLengths")









