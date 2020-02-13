package demonstrationold

object Loops {

    init {

        val listOfTexts = listOf("One", "Two", "Three")

        listOfTexts.forEach {  text ->
            println(text)
        }

        for (text in listOfTexts) {
            println(text)
        }

        (0..10).forEach {

        }
    }
}