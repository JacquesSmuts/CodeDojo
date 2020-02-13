package demonstrationold

enum class WhenEnums {
    ONE, TWO, THREE, FOUR, UNKNOWN
}

object WhenGoes {

    init {

        val enumy = WhenEnums.ONE

        println(when (enumy) {
            WhenEnums.ONE -> "one"
            WhenEnums.TWO -> "two"
            WhenEnums.THREE,
            WhenEnums.UNKNOWN -> "not one or two"
            WhenEnums.FOUR -> "four"
        })
    }
}