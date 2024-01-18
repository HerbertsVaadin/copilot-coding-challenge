package org.vaadin.challenges.algorithms;

// Write a program that prints the numbers from 1 to 30. But for multiples of three print “Fizz” instead of the number and for the multiples of five print “Buzz”. For numbers which are multiples of both three and five print “FizzBuzz”.
public class FizzBuzzThirty {
    // create a run method that prints numbers from 1 to 30
    public static void run() {
        // create a for loop that prints numbers from 1 to 30
        for (int i = 1; i <= 30; i++) {
            // if the number is a multiple of 3 and 5, print "FizzBuzz"
            if (i % 3 == 0 && i % 5 == 0) {
                System.out.println("FizzBuzz");
            // if the number is a multiple of 3, print "Fizz"
            } else if (i % 3 == 0) {
                System.out.println("Fizz");
            // if the number is a multiple of 5, print "Buzz"
            } else if (i % 5 == 0) {
                System.out.println("Buzz");
            // otherwise, print the number
            } else {
                System.out.println(i);
            }
        }
    }
}
