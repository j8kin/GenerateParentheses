import org.junit.jupiter.api.Test

import org.junit.jupiter.api.Assertions.*

class SolutionTest {
    private val solution = Solution()


    @Test
    fun generateParenthesis00() {
        assertEquals(emptyList<String>(), solution.generateParenthesis(0))
    }
    @Test
    fun generateParenthesis01() {
        assertEquals("()", solution.generateParenthesis(1)[0])
    }

    @Test
    fun generateParenthesis02() {
        val result = solution.generateParenthesis(2)
        assertEquals(2, result.size)
        assertEquals("()()", result[0])
        assertEquals("(())", result[1])
    }

    @Test
    fun generateParenthesis03() {
        val result = solution.generateParenthesis(3)
        assertEquals(5, result.size)
        assertEquals("()()()", result[0])
        assertEquals("(()())", result[1])
        assertEquals("()(())", result[2])
        assertEquals("(())()", result[3])
        assertEquals("((()))", result[4])
    }
    @Test
    fun generateParenthesis04() {
        val result = solution.generateParenthesis(4)
        assertEquals(14, result.size)
        assertEquals("()()()()", result[0])
        assertEquals("(()()())", result[1])
        assertEquals("()(()())", result[2])
        assertEquals("(()())()", result[3])
        assertEquals("((()()))", result[4])
        assertEquals("()()(())", result[5])
        assertEquals("()(())()", result[6])
        assertEquals("(()(()))", result[7])
    }
}