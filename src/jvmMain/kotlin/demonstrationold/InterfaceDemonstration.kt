package demonstrationold

interface InterfaceDemonstration {
    var text: String

    fun doThing(): String
}

abstract class Whatever(var number: Double) {
    var otherThing: String? = null
}

class WhateverInterface(nuNumber: Double) : InterfaceDemonstration, Whatever(nuNumber) {
    override var text: String = ""

    override fun doThing(): String {

        number = 0.0
        return 0.0.toString()
    }
}