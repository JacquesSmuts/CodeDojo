package demonstrationold


class BasicSyntax(var nameOfClass: String) {

    var thing: String = "null"
    val letThing: String
    var nullableThing: String? = null

    init {
        letThing = "readOnly"
        thing = "write"

        nullableThing?.let { notNullString(it) }

        val innerThing: String? = null

        if (innerThing != null) {
            notNullString(innerThing)
        }

    }

    fun notNullString(input: String) {
        println(input)

    }
}

object StaticBasicSyntax {

    init {

        val syntax = BasicSyntax("testy")
        println(syntax)

    }

}