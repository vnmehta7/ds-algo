package sorting;

import org.junit.Assert;
import org.junit.Test;
import org.junit.jupiter.api.DisplayName;

import java.util.Arrays;

public class ShellSortTest extends AbstractSortTest {

    @DisplayName("Execution of Shell sort ascending test")
    @Test
    public void testSortAscending() {
        ShellSort shellSort = new ShellSort();
        int[] sortedAscendingArrActual = shellSort.sortAscending(inputUnsortedArray);
        Assert.assertTrue(Arrays.equals(sortedAscendingArrActual, sortedAscendingArrExpected));
    }

    @DisplayName("Execution of Shell sort descending test")
    @Test
    public void testSortDescending() {
        ShellSort shellSort = new ShellSort();
        int[] sortedDescendingArrActual = shellSort.sortDescending(inputUnsortedArray);
        Assert.assertTrue(Arrays.equals(sortedDescendingArrActual, sortedDescendingArrExpected));
    }
}
