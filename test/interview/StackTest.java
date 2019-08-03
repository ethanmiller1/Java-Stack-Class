package interview;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StackTest {

    Stack stack;

    @BeforeEach
    void init() {
        stack = new Stack();
    }


    @Test
    public void isEmpty() {
        assertTrue(stack.isEmpty());
    }

    @Test
    public void isNotEmpty() {

        // arrange
        stack.count = 1;

        // act
        boolean result = stack.isEmpty();

        // assert
        assertFalse(result);
    }

    // Test push with isEmpty method.
    @Test
    public void pushNotEmpty() {
        // arrange
        stack.push(1);

        // act
        boolean result = stack.isEmpty();

        // assert
        boolean expected = false;
        assertEquals(expected, result);
    }

}