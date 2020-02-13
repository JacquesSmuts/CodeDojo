package problem

import org.junit.Test
import kotlin.test.assertEquals
import kotlin.test.assertFalse


internal class PalindromeSolutionTest {

    @Test
    fun isPalindrome() {

        assert(PalindromeSolution().isPalindrome(12321))
        assert(PalindromeSolution().isPalindrome(10001))
        assert(PalindromeSolution().isPalindrome(111))
        assertFalse(PalindromeSolution().isPalindrome(-111))
        assertFalse(PalindromeSolution().isPalindrome(122))
    }
}