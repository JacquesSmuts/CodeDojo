package problem

import org.junit.Test
import kotlin.test.assertEquals


internal class CountServersTest {

    @Test
    fun countServers() {
        assertEquals(4, CountServers().countServers( arrayOf(intArrayOf(1,1,0,0), intArrayOf(0,0,1,0), intArrayOf(0,0,1,0), intArrayOf(0,0,0,1))))

    }
}