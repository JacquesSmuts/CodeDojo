package problem

import java.util.*


/**
 * @see https://leetcode.com/problems/two-sum/
 */
class TwoSumSolution {

    fun twoSumBruteForce(nums: IntArray, target: Int): IntArray {

        nums.forEachIndexed { index, num ->
            val innerArray = nums.takeLast(nums.size-(index+1))
            innerArray.forEachIndexed { innerIndex, innerNum ->
                if ((num+innerNum) == target)
                    return intArrayOf(index, innerIndex+index+1)
            }
        }

        throw Exception("no solution")
    }

    fun twoSum(nums: IntArray, target: Int): IntArray {
        val map: MutableMap<Int, Int?> = HashMap()
        for (i in nums.indices) {
            val complement = target - nums[i]
            if (map.containsKey(complement)) {
                return intArrayOf(map[complement]!!, i)
            }
            map[nums[i]] = i
        }
        throw IllegalArgumentException("No two sum solution")
    }
}