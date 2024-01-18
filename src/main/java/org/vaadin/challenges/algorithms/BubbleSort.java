package org.vaadin.challenges.algorithms;


import java.util.List;

// create a bubble sort class that sorts a List of Strings

/**
 * The BubbleSort class provides a static method to sort a list of strings using the Bubble Sort algorithm.
 */
public class BubbleSort {
    
    /**
     * Sorts the given list of strings in ascending order using the Bubble Sort algorithm.
     * 
     * @param list the list of strings to be sorted
     */
    public static void bubbleSort(List<String> list) {
        int n = list.size();
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (list.get(j).compareTo(list.get(j + 1)) > 0) {
                    // Swap list[j] and list[j+1]
                    String temp = list.get(j);
                    list.set(j, list.get(j + 1));
                    list.set(j + 1, temp);
                }
            }
        }
    }
}
