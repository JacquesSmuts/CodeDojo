package problem

import java.lang.NumberFormatException

/**
 * https://leetcode.com/problems/reverse-integer/
 */
class ReverseSolution {

    fun reverse(input: Int): Int {
        return try {
            when (input) {
                in Int.MIN_VALUE..-1 -> (input * -1).toString().reversed().toInt() * -1
                in 0..Int.MAX_VALUE -> input.toString().reversed().toInt()
                else -> 0
            }
        } catch (e: NumberFormatException) {
            0
        }
    }
}