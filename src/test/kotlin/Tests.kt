import org.junit.jupiter.api.Test
import com.github.stefanbirkner.systemlambda.SystemLambda.*

internal class Tests{
    /**
     * Get result from the print command
     */
    private fun getResult(fn: ()-> Unit): String {
        val result = tapSystemOut {
            fn() }
        return result.trim()
    }

    /**
     * Test for apples and oranges!
     * @see [countApplesAndOranges]
     */
    @Test
    fun applesAndOranges(){
        kotlin.test.assertEquals(getResult {
            countApplesAndOranges(7,11,5,15, arrayOf(-2, 2, 1), arrayOf(5,-6))
         },
            "1\n1")
    }
}