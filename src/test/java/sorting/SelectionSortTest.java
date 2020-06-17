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
        selectionSort.sortAscending(inputArray);
        Assert.assertTrue(Arrays.equals(inputArray, sortedAscendingArrExpected));
    }

    @DisplayName("Execution of Selection sort descending test")
    @Test
    public void testSortDescending() {
        SelectionSort selectionSort = new SelectionSort();
        selectionSort.sortDescending(inputArray);
        Assert.assertTrue(Arrays.equals(inputArray, sortedDescendingArrExpected));
    }
}
