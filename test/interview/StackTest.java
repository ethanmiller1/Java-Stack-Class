package interview;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.NoSuchElementException;

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
        stack.push(1);

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

    // Test push with peakTop method.
    @Test
    public void pushTop() {
        // arrange
        stack.push(1);

        // act
        Object result = stack.peakTop();

        // assert
        assertEquals(1, result);
    }


    // Peak top with multiple layers.
    @Test
    public void peakTop() {
        // arrange - simulate the data.
        stack.push(1);
        stack.push(2);
        stack.push(3);

        // act - simulate the actions a user would take.
        Object result = stack.peakTop();

        // assert - assert what the response should be.
        assertEquals(3, result);
    }

    @Test
    public void pop() {
        // arrange
        stack.push(1);
        stack.push(2);

        // act
        Object result = stack.pop();

        // assert
        assertEquals(2,result);
    }

    @Test
    public void popReturnsSecondPushValuePeakReturnsFirstPushValue() {
        // arrange
        stack.push("First");
        stack.push("Second");

        // act
        Object pop = stack.pop();
        Object peak = stack.peakTop();

        // assert
        assertEquals("Second", pop);
        assertEquals("First", peak);
    }

    @Test
    public void exceptionTesting() {
        assertThrows(NoSuchElementException.class,
                () -> {
                    stack.pop();
                },
                "Stack is empty");
    }

}