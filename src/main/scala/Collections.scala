
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

    // flatten
    val flatten = List(List(1,2), List(3,4)).flatten
    println(s"flatten: $flatten")       // flatten: List(1, 2, 3, 4)

    val numberStringList = List("one", "two")

    // map
    val map = numberStringList.map(_.toUpperCase)
    println(s"map: $map")               // map: List(ONE, TWO)
    val map2 = numberStringList.map(value => value.toUpperCase())
    println(s"map2: $map2")             // map: List(ONE, TWO)

    // flatMap
    val flatMap = numberStringList.flatMap(_.toUpperCase)
    println(s"flatMap: $flatMap")       // flatMap: List(O, N, E, T, W, O)

    val firstTen = (1 to 10).toList
    // sum the list of integers
    val sum = firstTen.reduceLeft(_ + _)
    println(s"sum: $sum")               // sum: 55

    val sum2 = firstTen.reduceLeft((a, b) => a + b)
    println(s"sum2: $sum2")             // sum2: 55

    // find the minimum element
    val h = List(3, 10, 8, 9, 2, 1, 7)
    val min = h.reduceLeft(_ min _)
    println(s"min: $min")               // min: 1

    // find the maximum element
    val max = h.reduceLeft(_ max _)
    println(s"max: $max")               // max: 10
    
    // foldLeft has an initial seed value
    val foldLeft = firstTen.foldLeft(100)(_ + _)
    println(s"foldLeft: $foldLeft")

    tupleRunner()


def tupleRunner(): Unit = 
    println("> Tuples")

    val t = (11, "eleven", ClassNumber("Eleven"))
    println(s"t0: ${t(0)}")             // t0: 11
    println(s"t0: ${t(1)}")             // t1: eleven
    println(s"t0: ${t(2)}")             // t2: ClassNumber(Eleven)

    // using extractor approach
    val (num, str, cn) = t
    println(s"num: $num")               // num: 11
    println(s"str: $str")               // str: eleven
    println(s"classNumber: $cn")        // classNumber: ClassNumber(Eleven)


case class ClassNumber(name: String)
