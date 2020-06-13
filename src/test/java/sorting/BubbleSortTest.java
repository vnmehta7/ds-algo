package sorting;


import org.junit.Assert;
import org.junit.Test;
import org.junit.jupiter.api.DisplayName;

import java.util.Arrays;

public class BubbleSortTest extends AbstractSortTest {

    @DisplayName("Execution of bubble sort ascending test")
    @Test
    public void testSortAscending() {
        BubbleSort bubbleSort = new BubbleSort();
        int[] sortedAscendingArrActual = bubbleSort.sortAscending(new int[]{23, -21, 11, 9, 32, 9});
        Assert.assertTrue(Arrays.equals(sortedAscendingArrActual, sortedAscendingArrExpected));
    }

    @DisplayName("Execution of bubble sort descending test")
    @Test
    public void testSortDescending() {
        BubbleSort bubbleSort = new BubbleSort();
        int[] sortedDescendingArrActual = bubbleSort.sortDescending(new int[]{23, -21, 11, 9, 32, 9});
        Assert.assertTrue(Arrays.equals(sortedDescendingArrActual, sortedDescendingArrExpected));
    }
}
