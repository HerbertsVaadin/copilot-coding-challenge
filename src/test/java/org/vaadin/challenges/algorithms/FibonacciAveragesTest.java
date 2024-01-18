package org.vaadin.challenges.algorithms;

import org.junit.jupiter.api.Test;
import org.vaadin.challenges.algorithms.FibonacciAverages;

import static org.junit.jupiter.api.Assertions.*;

public class FibonacciAveragesTest {
    
    @Test
    public void testCalculateFibonacciAverageWithPositiveN() {
        int n = 5;
        double expectedAverage = 1.4;
        double actualAverage = FibonacciAverages.calculateFibonacciAverage(n);
        assertEquals(expectedAverage, actualAverage, 0.001);
    }
    
    @Test
    public void testCalculateFibonacciAverageWithNEqualToOne() {
        int n = 1;
        double expectedAverage = 0.0;
        double actualAverage = FibonacciAverages.calculateFibonacciAverage(n);
        assertEquals(expectedAverage, actualAverage, 0.001);
    }
    
    @Test
    public void testCalculateFibonacciAverageWithNEqualToTwo() {
        int n = 2;
        double expectedAverage = 0.5;
        double actualAverage = FibonacciAverages.calculateFibonacciAverage(n);
        assertEquals(expectedAverage, actualAverage, 0.001);
    }
    
    @Test
    public void testCalculateFibonacciAverageWithLargeN() {
        int n = 10;
        double expectedAverage = 8.8;
        double actualAverage = FibonacciAverages.calculateFibonacciAverage(n);
        assertEquals(expectedAverage, actualAverage, 0.001);
    }
    
    @Test
    public void testCalculateFibonacciAverageWithNegativeN() {
        int n = -5;
        assertThrows(IllegalArgumentException.class, () -> {
            FibonacciAverages.calculateFibonacciAverage(n);
        });
    }
}