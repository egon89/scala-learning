enum CrustSize:
    case Small, Medium, Large

case class Person(name: String, vocation: String)


def FPDataModelingRunner(): Unit =
    println("FP Data Modeling")
    val currentCrustSize = CrustSize.Medium
    
    currentCrustSize match
        case CrustSize.Small => println("Small crust size")
        case CrustSize.Medium => println("Medium crust size")
        case CrustSize.Large => println("Large crust size")

    println("Case class")

    val p = Person("Reginald Kenneth Dwight", "Singer")
    println(p)      // toString method: Person(Reginald Kenneth Dwight,Singer)
    println(p.name) // accessor method for name: Reginald Kenneth Dwight

    // p.name = "Joe" // error: can't reassign a val field

    // to make a change, use the copy method to create a new one
    val p2 = p.copy(name = "Luciano Pavarotti")
    println(p2)     // Person(Luciano Pavarotti,Singer)
    
