fun main() {

    println("let function")
    val letFunction = LetFunction()
    letFunction.printSome()

    println("run function")
    val runFunction = RunFunction()
    runFunction.printSome()

    println("with \"function\"")
    val configuration = Configuration(host = "127.0.0.1", port = 9000)

    with(configuration) {
        println("$host:$port")
    }

    // instead of:
    println("${configuration.host}:${configuration.port}")
    println()

    println("something about apply")
    val jake = Person()                         //Creates a Person() instance with default property values.
    val stringDescription = jake.apply {        //Applies the code block (next 3 lines) to the instance.
        name = "Jake"                           //Inside apply, it's equivalent to jake.name = "Jake".
        age = 30
        about = "Android developer"
    }.toString()                               //The return value is the instance itself, so you can chain other operations.
    println(stringDescription)

    val john = Person("John", 45, "Divorced depressed slob")
        .also {                      //Applies the given code block to the object. The return value is the object itself.
            writeCreationLog(it)     //Calls the logging function passing the object as an argument.
        }
    println(john.toString())

}

fun writeCreationLog(p: Person) {
    println("A new person ${p.name} was created.")
}