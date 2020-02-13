package problem

class HarmoniousArray {
    fun findLHS(nums: IntArray): Int {

        val map = mutableMapOf<Int, Int>()
        nums.forEach {

            map[it] = map[it]?.let {  value ->
                value+1
            } ?: 1

        }

        var currentMax = 0

        map.forEach { (key, value) ->
            var count = 0

            map[key+1]?.let {
                count = value + it

                if (count > currentMax ) {
                    currentMax = count
                }
            }


        }

        map.keys.forEach {
            var count :Int = 0
            if (map.containsKey(it+1)) {
                count = map[it]!! + map[it + 1]!!
            }
            if (count > currentMax ) {
                currentMax = count
            }
        }

        return currentMax
    }
}