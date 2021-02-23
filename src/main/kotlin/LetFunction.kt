class LetFunction {
    fun customPrint(s: String) {
        print(s.toUpperCase())
    }

    fun printSome() {
        val empty = "test".let {               //Calls the given block on the result on the string "test".
            customPrint(it)                    //Calls the function on "test" by the it reference.
            it.isEmpty()                       //let returns the value of this expression.
        }
        println(" is empty: $empty")


        fun printNonNull(str: String?) {
            println("Printing \"$str\":")

            str?.let {                 //Uses safe call, so let and its code block will be executed only on non-null values.
                print("\t")
                customPrint(it)
                println(" - db")
            }
        }
        printNonNull(null)
        printNonNull("my string")
        println()
    }
}