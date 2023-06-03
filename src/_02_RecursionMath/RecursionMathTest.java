package _02_RecursionMath;

import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class RecursionMathTest {
    
    @Test
    public void testMultiplication() {
        assertEquals(12, RecursionMath.recursiveMultiplication(3, 4));
        assertEquals(15, RecursionMath.recursiveMultiplication(5, 3));
        // Add more JUnit tests like the one above to test your method
        
    }

    @Test
    public void testDivision() {
        // Add JUnit tests to test your method
        assertEquals(15, RecursionMath.recursiveDivision(45,3));
    }

    @Test 
    public void testPower() {
        // Add JUnit tests to test your method
        assertEquals(125, RecursionMath.recursivePower(5,3));
    }
}
