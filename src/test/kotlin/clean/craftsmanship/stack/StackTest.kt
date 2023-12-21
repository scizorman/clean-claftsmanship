package clean.craftsmanship.stack

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Assertions.assertFalse
import org.junit.jupiter.api.Assertions.assertTrue
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.assertThrows

class StackTest {
    private val stack = Stack()

    @Test
    fun canCreateStack() {
        assertTrue(stack.isEmpty())
    }

    @Test
    fun `stack is not empty when after one push`() {
        stack.push(0)
        assertFalse(stack.isEmpty())
        assertEquals(1, stack.getSize())
    }

    @Test
    fun `stack is empty when after one push and one pop`() {
        stack.push(0)
        stack.pop()
        assertTrue(stack.isEmpty())
    }

    @Test
    fun `stack size is two when after two pushes`() {
        stack.push(0)
        stack.push(0)
        assertEquals(2, stack.getSize())
    }

    @Test
    fun `throws underflow when popping empty stack`() {
        assertThrows<Underflow> {
            stack.pop()
        }
    }

    @Test
    fun `pop x after pushing x`() {
        stack.push(99)
        assertEquals(99, stack.pop())
        stack.push(88)
        assertEquals(88, stack.pop())
    }

    @Test
    fun `should pop y then x after pushing x and y`() {
        stack.push(99)
        stack.push(88)
        assertEquals(88, stack.pop())
        assertEquals(99, stack.pop())
    }
}
