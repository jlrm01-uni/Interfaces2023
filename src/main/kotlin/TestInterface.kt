interface TestInterface {
    var obligatoryProperty: String

    fun emptyAbstractFunction()

    fun next()

    fun emptyButWithDefaultImplementation() {
        println("I'll do this by default, unless overriden")
    }
}