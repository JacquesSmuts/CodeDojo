package demonstrationold

sealed class SealedClassy {
    object UNKNOWN: SealedClassy()
    class Error(var errorcode: Int): SealedClassy()
    class Success<T>(var result: T): SealedClassy()
}

object SealedTesty {

    init {

        val getSealedClassy: SealedClassy = SealedClassy.Success("resulty")

        when (getSealedClassy) {
            SealedClassy.UNKNOWN -> TODO()
            is SealedClassy.Error -> TODO()
            is SealedClassy.Success<*> -> TODO()
        }
    }
}