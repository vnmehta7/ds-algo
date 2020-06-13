package sorting;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class BubbleSort {

    public int[] sort(int[] inputArr) {
        for (int i = inputArr.length - 1; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                if (inputArr[j] == inputArr[j + 1]) {
                    continue;
                } else if (inputArr[j] > inputArr[j + 1]) {
                    swap(inputArr, j, j + 1);
                }
            }
        }
        return inputArr;
    }

    private void swap(int[] inputArr, int i, int j) {
        int temp = inputArr[j];
        inputArr[j] = inputArr[i];
        inputArr[i] = temp;
    }

}
