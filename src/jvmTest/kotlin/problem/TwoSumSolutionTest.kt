package problem

import org.junit.Test


internal class TwoSumSolutionTest {

    @Test
    fun twoSumTest() {

        val result = TwoSumSolution().twoSum(intArrayOf(1,2,7,9,10), 9)
        assert(result.contains(1) && result.contains(2) && result.size <= 2)

        val result2 = TwoSumSolution().twoSum(intArrayOf(0,2,7,9,10), 11)
        assert(result2.contains(1) && result2.contains(3) && result2.size <= 2)
    }
}