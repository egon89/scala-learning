trait Pet:
    val name: String // abstract field

trait Speaker:
    def speak(): String // abstract (no body)

trait TailWagger:
    def startTail(): Unit = println("tail is wagging")
    def stopTail(): Unit = println("tail is stopped")

trait Runner:
    def startRunning(): Unit = println("I'm running")
    def stopRunning(): Unit = println("stopped running")

class Dog(val name: String) extends Pet, Speaker, TailWagger, Runner:
    def speak(): String = "Woof"
    def print(): Unit =
        println(s"I'm $name. ${this.speak()}!")
        this.startRunning()
        this.stopRunning()
        this.startTail()
        this.stopTail()

class Cat(val name: String) extends Pet, Speaker, TailWagger, Runner:
    def speak(): String = "Meow"
    override def startRunning(): Unit = println("I don't want to run")
    override def stopRunning(): Unit = println("I don't want to stop")
    def print(): Unit =
        println(s"I'm $name. ${this.speak()}!")
        this.startRunning()
        this.stopRunning()
        this.startTail()
        this.stopTail()

class MutablePerson(var name: String, var document: String):
    def print(): Unit = println(s"Name: $name. Document: $document")
    def changeDocument(document: String): Unit =
        println(s"$name: document changed from ${this.document} to $document")
        this.document = document

class ImmutablePerson(name: String, document: String):
    def print(): Unit = println(s"Name: $name. Document: $document")

class ExplicitImmutablePerson(val name: String, val document: String):
    def print(): Unit = println(s"Name: $name. Document: $document")

def OOPDataModelingRunner(): Unit =
    println("OOP Data Modeling")
    val dog = new Dog("Rover")
    dog.print()

    val cat = new Cat("Morris")
    cat.print()

    val person = new MutablePerson("Joseph", "0123456")
    person.changeDocument("147852369")
    person.print()
    