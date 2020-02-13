package demonstrationold

import java.util.*
import kotlin.contracts.ExperimentalContracts
import kotlin.contracts.contract

class Person(var id: String, val name: String, val birthday: Date?) {

}

@ExperimentalContracts
fun Any?.isRealPerson(): Boolean {
    contract {
        returns(true) implies (this@isRealPerson is Person)
    }

    return this is Person
}


@ExperimentalContracts
object ContractualSuccess {

    init {

        val person: Any? = Person("id", "name", null)

        if (person.isRealPerson()) {
            val id = person.id
            println(id)
        }

    }
}