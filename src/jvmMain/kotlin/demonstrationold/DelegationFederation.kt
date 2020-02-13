package demonstrationold

import kotlin.properties.Delegates


object testyery {

    var text: String? = null
        get() {
            if (field == null) {
                field = "lazily loaded text"
            }
            return field
        }

    val lazyText: String by lazy { "lazily loaded text" }

    var screamWhenChanged by Delegates.observable(initialValue = "aaa") { _, before, after ->
        if (before != after)
            println(after)
    }

    init {
        screamWhenChanged = "boooo"
    }
}