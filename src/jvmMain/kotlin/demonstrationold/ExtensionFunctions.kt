package demonstrationold

object ExtensionFunctions {

    init {
        val double: Double = 0.00002

        double.toUser()

        double.numbersAfterDecimal
    }
}

private fun Double.toUser(): User {
    return User(this)
}

private val Double.numbersAfterDecimal: Unit
    get() {
        this % 1
    }


data class User(val id: Double)