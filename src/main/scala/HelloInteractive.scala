import scala.io.StdIn.readLine

def helloInteractive() =
  println("Please, enter your name:")
  val name = readLine()

  println(s"Hello, $name! :)")

