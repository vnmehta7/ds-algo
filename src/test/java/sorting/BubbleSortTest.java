package sorting;


import org.junit.Assert;
import org.junit.Test;
import org.junit.jupiter.api.DisplayName;

import java.util.Arrays;

public class BubbleSortTest {

    @DisplayName("Execution of bubble sort test")
    @Test
    public void testSorting() {
        int[] sortedArrExpected = new int[]{-21, 9, 9, 11, 23, 32};
        BubbleSort bubbleSort = new BubbleSort();
        int[] sortedArrActual = bubbleSort.sort(new int[]{23, -21, 11, 9, 32, 9});
        Assert.assertTrue(Arrays.equals(sortedArrActual, sortedArrExpected));
    }
}
