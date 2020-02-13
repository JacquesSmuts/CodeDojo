package demonstrationold

object ReceiverFunctions {

    fun doApiCall(input: String, result: (String) -> Boolean) {

        Thread.sleep(1000)
        result("result: $input")
    }

    fun callApiCall() {

        doApiCall("inpppuuuuutt") { result ->
            println(result)
            (result.length > 1)
        }
    }
}