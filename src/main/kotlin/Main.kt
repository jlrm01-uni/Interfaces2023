fun main(args: Array<String>) {
    val instance = MyClassThatImplementsAnInterface()

    instance.emptyAbstractFunction()
    instance.emptyButWithDefaultImplementation()
    instance.next()
    instance.anotherFuncHere()
    instance.play("Greatest Hits")

    instance.obligatoryProperty = "blah blah blah tidal wave!"
}