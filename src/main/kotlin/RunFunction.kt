class RunFunction {
    fun printSome() {
        fun getNullableLength(ns: String?) {
            println("for \"$ns\":")
            ns?.run {                                         //Calls the given block on a nullable variable.
                println("\tis empty? " + isEmpty())           //Inside run, the object's members are accessed without its name.
                println("\tlength = $length")
                length                                        //run returns the length of the given String if it's not null.
            }
        }
        getNullableLength(null)
        getNullableLength("")
        getNullableLength("some string with Kotlin")
        println()
    }
}