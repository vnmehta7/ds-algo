package sorting;

import org.junit.Assert;
import org.junit.Test;
import org.junit.jupiter.api.DisplayName;

import java.util.Arrays;

public class InsertionSortTest extends AbstractSortTest {
    @DisplayName("Execution of insertion sort ascending test")
    @Test
    public void testSortAscending() {
        InsertionSort insertionSort = new InsertionSort();
        int[] sortedAscendingArrActual = insertionSort.sortAscending(inputUnsortedArray);
        Assert.assertTrue(Arrays.equals(sortedAscendingArrActual, sortedAscendingArrExpected));
    }

    @DisplayName("Execution of insertion sort descending test")
    @Test
    public void testSortDescending() {
        InsertionSort insertionSort = new InsertionSort();
        int[] sortedDescendingArrActual = insertionSort.sortDescending(inputUnsortedArray);
        Assert.assertTrue(Arrays.equals(sortedDescendingArrActual, sortedDescendingArrExpected));
    }
}
