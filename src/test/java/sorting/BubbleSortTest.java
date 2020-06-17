package sorting;


import org.junit.Assert;
import org.junit.Test;
import org.junit.jupiter.api.DisplayName;

import java.util.Arrays;

public class BubbleSortTest extends AbstractSortTest {

    @DisplayName("Execution of Bubble sort ascending test")
    @Test
    public void testSortAscending() {
        BubbleSort bubbleSort = new BubbleSort();
        bubbleSort.sortAscending(inputArray);
        Assert.assertTrue(Arrays.equals(inputArray, sortedAscendingArrExpected));
    }

    @DisplayName("Execution of Bubble sort descending test")
    @Test
    public void testSortDescending() {
        BubbleSort bubbleSort = new BubbleSort();
        bubbleSort.sortDescending(inputArray);
        Assert.assertTrue(Arrays.equals(inputArray, sortedDescendingArrExpected));
    }
}
