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

## Road Map
> [Scala 3 Book](https://docs.scala-lang.org/scala3/book/introduction.html)

- [ ] A Taste of Scala
  - [x] Hello, World!
  - [x] The REPL
  - [ ] Variables and Data Types
    - [ ] Two types of variables
    - [ ] Declaring variable types
    - [ ] Built-in data types
