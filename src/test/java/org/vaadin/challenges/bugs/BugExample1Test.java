package org.vaadin.challenges.bugs;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class BugExample1Test {
    
    @Test
    public void testDivide() {
        // Test case 1: Dividing two positive numbers
        int result1 = BugExample1.divide(10, 2);
        assertEquals(5, result1);
        
        // Test case 2: Dividing a positive number by zero
        assertThrows(ArithmeticException.class, () -> {
            BugExample1.divide(10, 0);
        });
        
        // Test case 3: Dividing zero by a positive number
        int result3 = BugExample1.divide(0, 5);
        assertEquals(0, result3);
        
        // Test case 4: Dividing a negative number by a positive number
        int result4 = BugExample1.divide(-10, 2);
        assertEquals(-5, result4);
        
        // Test case 5: Dividing a positive number by a negative number
        int result5 = BugExample1.divide(10, -2);
        assertEquals(-5, result5);
    }
}