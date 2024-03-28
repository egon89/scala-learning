
def collectionsRunner(): Unit =
    println("Collections")

    println("# Creating lists")
    val a = List(1, 2, 3)
    println(s"a: $a")               // a: List(1, 2, 3)

    // Range methods
    val b = (1 to 5).toList
    println(s"b: $b")               // b: List(1, 2, 3, 4, 5)

    val c = (1 to 10 by 2).toList
    println(s"c: $c")               // c: List(1, 3, 5, 7, 9)

    val d = (1 until 5).toList
    println(s"d: $d")               // d: List(1, 2, 3, 4)

    val e = List.range(1, 5)
    println(s"e: $e")               // e: List(1, 2, 3, 4)

    val g = List.range(1, 10, 3)
    println(s"g: $g")               // g: List(1, 4, 7)

    println(s"${(1 to 10 by 2).toList} is the same as ${List.range(1, 10, 2)}")

    println("# List methods")
    val nums = List(10, 20, 30, 40, 10)
    println(s"nums: $nums")             // nums: List(10, 20, 30, 40, 10)

    val drop = nums.drop(2)
    println(s"drop: $drop")             // drop: List(30, 40, 10)

    // drops until it reaches a number greater than or equal to 25
    // in this case, the drop has stopped when it reached 30, so the next
    // elements (including 10) won't be dropped
    val dropWhile = nums.dropWhile(_ < 25)
    println(s"dropWhile: $dropWhile")   // dropWhile: List(30, 40, 10)

    val filter = nums.filter(_ < 25)
    println(s"filter: $filter")         // filter: List(10, 20, 10)

    // slice(fromIndex, untilIndex)
    val slice = nums.slice(2, 4)
    println(s"slice: $slice")           // slice: List(30, 40)

    // it returns all the elements except the first
    val tail = nums.tail
    println(s"tail: $tail")             // tail: List(20, 30, 40, 10)

    // to take the first N elements from the list
    val take = nums.take(3)
    println(s"take: $take")             // take: List(10, 20, 30)

    val takeWhile = nums.takeWhile(_ < 30)
    println(s"takeWhile: $takeWhile")   // takeWhile: List(10, 20)
