package org.vaadin.challenges.algorithms;

public class FibonacciAverages {
    public static double calculateFibonacciAverage(int n) {
        if (n <= 0) {
            throw new IllegalArgumentException("n must be a positive integer");
        } else if (n == 1) {
            return 0.0;
        }

        int[] fibonacciNumbers = new int[n];
        fibonacciNumbers[0] = 0;
        fibonacciNumbers[1] = 1;

        for (int i = 2; i < n; i++) {
            fibonacciNumbers[i] = fibonacciNumbers[i - 1] + fibonacciNumbers[i - 2];
        }

        int sum = 0;
        for (int i = 0; i < n; i++) {
            sum += fibonacciNumbers[i];
        }

        return (double) sum / n;
    }
}


