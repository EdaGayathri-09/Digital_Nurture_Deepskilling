package com.gayathri;

import static org.junit.Assert.assertEquals;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class AAATest {

    Calculator calc;

    // Setup method - runs before every test
    @Before
    public void setUp() {
        calc = new Calculator();
        System.out.println("Setup completed");
    }


    @Test
    public void testAddition() {

        // Arrange
        int a = 10;
        int b = 20;

        // Act
        int result = calc.add(a, b);

        // Assert
        assertEquals(30, result);
    }


    @Test
    public void testSubtraction() {

        // Arrange
        int a = 20;
        int b = 10;

        // Act
        int result = calc.subtract(a, b);

        // Assert
        assertEquals(10, result);
    }


    // Teardown method - runs after every test
    @After
    public void tearDown() {
        calc = null;
        System.out.println("Cleanup completed");
    }
}
