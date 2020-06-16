package sorting;

import org.junit.Assert;
import org.junit.Test;
import org.junit.jupiter.api.DisplayName;

import java.util.Arrays;

public class SelectionSortTest extends AbstractSortTest {

    @DisplayName("Execution of Selection sort ascending test")
    @Test
    public void testSortAscending() {
        SelectionSort selectionSort = new SelectionSort();
        int[] sortedAscendingArrActual = selectionSort.sortAscending(inputUnsortedArray);
        Assert.assertTrue(Arrays.equals(sortedAscendingArrActual, sortedAscendingArrExpected));
    }

    @DisplayName("Execution of Selection sort descending test")
    @Test
    public void testSortDescending() {
        SelectionSort selectionSort = new SelectionSort();
        int[] sortedDescendingArrActual = selectionSort.sortDescending(inputUnsortedArray);
        Assert.assertTrue(Arrays.equals(sortedDescendingArrActual, sortedDescendingArrExpected));
    }
}
