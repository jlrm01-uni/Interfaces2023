class MyClassThatImplementsAnInterface: TestInterface, SecondInterface {
    override var obligatoryProperty: String = "Testing"

    override fun emptyAbstractFunction() {
        println("Ooh hey, I got implemented, finally!")
    }

    override fun next() {
        println("Go next! Go!")
    }

    override fun emptyButWithDefaultImplementation() {
        println("More stuff to implement?! Fiiiine.")
    }

    override fun anotherFuncHere() {
        print("This one is from the second interface!")
    }

    override fun play(what: String) {
        println("I'm playing $what")
    }

}