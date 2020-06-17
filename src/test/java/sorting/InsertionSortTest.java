package sorting;

import org.junit.Assert;
import org.junit.Test;
import org.junit.jupiter.api.DisplayName;

import java.util.Arrays;

public class InsertionSortTest extends AbstractSortTest {
    @DisplayName("Execution of Insertion sort ascending test")
    @Test
    public void testSortAscending() {
        InsertionSort insertionSort = new InsertionSort();
        insertionSort.sortAscending(inputArray);
        Assert.assertTrue(Arrays.equals(inputArray, sortedAscendingArrExpected));
    }

    @DisplayName("Execution of Insertion sort descending test")
    @Test
    public void testSortDescending() {
        InsertionSort insertionSort = new InsertionSort();
        insertionSort.sortDescending(inputArray);
        Assert.assertTrue(Arrays.equals(inputArray, sortedDescendingArrExpected));
    }
}
