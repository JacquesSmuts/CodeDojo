package demonstrationold

import org.junit.Test

internal class DataClassesTest {

    @Test
    fun getName() {

        val testedClass = DataClasses("1", "jack", "smith")

        assert(testedClass.name.isNotEmpty())
//        assert(testedClass.id.isNotEmpty())
    }
}