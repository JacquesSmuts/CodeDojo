package problem

import org.junit.Test
import kotlin.test.assertEquals

internal class ReverseIntegerTest {

    @Test
    fun addTwoNumberTest() {

        assertEquals(4321, ReverseSolution().reverse(1234))
        assertEquals(5897, ReverseSolution().reverse(7985))
        assertEquals(-321, ReverseSolution().reverse(-123))
        assertEquals(21, ReverseSolution().reverse(120))
        assertEquals(153423469, ReverseSolution().reverse(964324351))

    }



}