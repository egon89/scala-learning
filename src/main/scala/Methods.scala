
def concatenate(s1: String, s2: String): String = s1 + s2

// without return type
def concatenate2(s1: String, s2: String) = s1 + s2

// parameters default values
def makeConnection(url: String, timeout: Int = 5000): Unit =
    println(s"url=$url, timeout=$timeout")

extension(s: String)
    def makeInt(): Int = Integer.parseInt(s)

extension(i: Int)
    def multiply(value: Int): Int = i * value
    def add(value: Int): Int = i + value

def ScalaMethodsRunner(): Unit =
    println("> Scala methods")
    makeConnection("http://localhost")          // url=http://localhost, timeout=5000
    makeConnection("http://localhost", 2500)    // url=http://localhost, timeout=2500

    // named parameters
    makeConnection(
        url = "http://localhost",
        timeout = 1500
    )

    val multiplyResut = 5.multiply(2)
    println(multiplyResut)      // 10

    val sumResult = 5.add(2)
    println(sumResult)          // 7

    val chainResult = "100".makeInt().multiply(2)
    println(chainResult)        // 200
