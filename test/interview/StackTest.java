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


}