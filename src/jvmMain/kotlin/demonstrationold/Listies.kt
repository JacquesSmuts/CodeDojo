package demonstrationold

object Listies {


    init {

        val fruits = listOf("Banana", "Pineapple", "Apple")

        fruits
            .sortedBy { it.length }
            .map { "Fruit: $it" }
            .forEach { println(it) }
    }
}