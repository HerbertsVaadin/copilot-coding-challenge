package org.vaadin.challenges.algorithms;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class BubbleSortTest {
    @Test
    public void testBubbleSort() {
        List<String> list = new ArrayList<>(Arrays.asList("banana", "apple", "cherry", "date"));
        BubbleSort.bubbleSort(list);
        List<String> expected = Arrays.asList("apple", "banana", "cherry", "date");
        assertEquals(expected, list);
    }
}