def firstClassFunctionsRunner(): Unit =
    println("Immutable collections")

    val a = List(1, 2, 3).map(i => i * 2)
    println(a)

    val b = List(1, 2, 3).map(_ * 2)
    println(b)

    val nums = (1 to 10).toList
    val result = nums.filter(_ > 3)
        .filter(_ < 7)
        .map(_ * 10)
    
    // the nums is an immutable collection
    // the filter and map functions don't affect the original result
    println(nums)   // List(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)
    println(result) // List(40, 50, 60)
