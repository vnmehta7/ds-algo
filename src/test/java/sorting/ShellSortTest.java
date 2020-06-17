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
        shellSort.sortAscending(inputArray);
        Assert.assertTrue(Arrays.equals(inputArray, sortedAscendingArrExpected));
    }

    @DisplayName("Execution of Shell sort descending test")
    @Test
    public void testSortDescending() {
        ShellSort shellSort = new ShellSort();
        shellSort.sortDescending(inputArray);
        Assert.assertTrue(Arrays.equals(inputArray, sortedDescendingArrExpected));
    }
}
