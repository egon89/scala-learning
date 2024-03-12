# Scala learning
> Scala is an expressive programming language, with a clean, modern syntax, which supports functional programming (FP) and object-oriented programming (OOP), and that provides a safe static type system. 

### Using the scala workspace
~~~bash
docker-compose up -d
docker-compose exec devcontainer bash
~~~
The project files are mounted in `/workspace` directory.

---

### Create the project
~~~bash
sbt new scala/scala3.g8
~~~
Enter the project name.

[Create project reference](https://docs.scala-lang.org/getting-started/index.html)

---

### Run
~~~bash
# open the sbt console
sbt

# the ~ is optional. It causes sbt to re-run on every file save.
~run
~~~
![First execution](./docs/images/first_execution.png)

## The REPL
Running `scala` command in the terminal.

## Variables and Data Types
> In Scala, everything is an object.

| Type | Description |
| --- | --- |
| val | Immutable - like final in Java |
| var | Mutable |

### Declaring variable types
```scala
val x: Int = 1
val x = 1
val nums: List[Int] = List(1,2,3)
val nums = List(1,2,3)
```

### Built-in data types
- The `Int` and `Double`are the default numeric type
- We can use `L`, `D` and `F` to specify that they are _Long_, _Double_ and _Float_
- For **large numbers**, use `BigInt`and `BigDecimal` types
  - Use `BigDecimal` for precise arithmetic


## Road Map
> [Scala 3 Book](https://docs.scala-lang.org/scala3/book/introduction.html)

- [ ] A Taste of Scala
  - [x] Hello, World!
  - [x] The REPL
  - [x] Variables and Data Types
    - [x] Two types of variables
    - [x] Declaring variable types
    - [x] Built-in data types
