package sorting;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class BubbleSort {

    public int[] sortAscending(int[] inputArr) {
        for (int i = inputArr.length - 1; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                if (inputArr[j] > inputArr[j + 1]) {
                    CommonUtil.swap(inputArr, j, j + 1);
                }
            }
        }
        return inputArr;
    }

    public int[] sortDescending(int[] inputArr) {
        for (int i = inputArr.length - 1; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                if (inputArr[j] < inputArr[j + 1]) {
                    CommonUtil.swap(inputArr, j, j + 1);
                }
            }
        }
        return inputArr;
    }
}
