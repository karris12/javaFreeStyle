package com.example;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 * Unit tests for Calculator class
 * These tests will be used by JaCoCo for code coverage analysis
 */
public class CalculatorTest {
    
    private Calculator calculator;
    
    @Before
    public void setUp() {
        calculator = new Calculator();
    }
    
    @Test
    public void testAdd() {
        assertEquals(10, calculator.add(5, 5));
        assertEquals(0, calculator.add(-5, 5));
        assertEquals(-10, calculator.add(-5, -5));
    }
    
    @Test
    public void testSubtract() {
        assertEquals(0, calculator.subtract(5, 5));
        assertEquals(10, calculator.subtract(15, 5));
        assertEquals(-10, calculator.subtract(5, 15));
    }
    
    @Test
    public void testMultiply() {
        assertEquals(25, calculator.multiply(5, 5));
        assertEquals(0, calculator.multiply(5, 0));
        assertEquals(-25, calculator.multiply(5, -5));
    }
    
    @Test
    public void testDivide() {
        assertEquals(2.0, calculator.divide(10, 5), 0.001);
        assertEquals(2.5, calculator.divide(5, 2), 0.001);
    }
    
    @Test(expected = IllegalArgumentException.class)
    public void testDivideByZero() {
        calculator.divide(10, 0);
    }
    
    @Test
    public void testIsEven() {
        assertTrue(calculator.isEven(4));
        assertTrue(calculator.isEven(0));
        assertFalse(calculator.isEven(5));
        assertFalse(calculator.isEven(-3));
    }
    
    @Test
    public void testFactorial() {
        assertEquals(1, calculator.factorial(0));
        assertEquals(1, calculator.factorial(1));
        assertEquals(120, calculator.factorial(5));
        assertEquals(720, calculator.factorial(6));
    }
    
    @Test(expected = IllegalArgumentException.class)
    public void testFactorialNegative() {
        calculator.factorial(-1);
    }
}
