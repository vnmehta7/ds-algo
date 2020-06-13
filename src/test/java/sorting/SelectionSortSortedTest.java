package sorting;

import org.junit.Assert;
import org.junit.Test;
import org.junit.jupiter.api.DisplayName;

import java.util.Arrays;

public class SelectionSortSortedTest extends AbstractSortedTest {

    @DisplayName("Execution of selection sort ascending test")
    @Test
    public void testSortAscending() {
        SelectionSort selectionSort = new SelectionSort();
        int[] sortedAscendingArrActual = selectionSort.sortAscending(new int[]{23, -21, 11, 9, 32, 9});
        Assert.assertTrue(Arrays.equals(sortedAscendingArrActual, sortedAscendingArrExpected));
    }

    @DisplayName("Execution of selection sort descending test")
    @Test
    public void testSortDescending() {
        SelectionSort selectionSort = new SelectionSort();
        int[] sortedDescendingArrActual = selectionSort.sortDescending(new int[]{23, -21, 11, 9, 32, 9});
        Assert.assertTrue(Arrays.equals(sortedDescendingArrActual, sortedDescendingArrExpected));
    }
}
