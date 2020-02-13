package problem

import org.junit.Test
import kotlin.test.assertEquals

internal class HarmoniousArrayTest {

    @Test
    fun findLHS() {

        val harmoniousArray = HarmoniousArray()

        assertEquals(5,
            harmoniousArray.findLHS(intArrayOf(1,3,2,2,5,2,3,7))
        )
        assertEquals(5,
            harmoniousArray.findLHS(intArrayOf(1,3,2,2,5,2,3,7))
        )

        assertEquals(4,
            harmoniousArray.findLHS(intArrayOf(6,4,3,4,3,2,2,1))
        )

        assertEquals(4,
            harmoniousArray.findLHS(intArrayOf(-10, -10,-9,-9, 9, 10, 5,4))
        )

        assertEquals(0,
            harmoniousArray.findLHS(intArrayOf(1,1,1,1))
        )

    }
}