package sorting;


public class BubbleSort {

    public void sortAscending(int[] inputArr) {
        for (int i = inputArr.length - 1; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                if (inputArr[j] > inputArr[j + 1]) {
                    CommonUtil.swap(inputArr, j, j + 1);
                }

            }
        }
    }

    public void sortDescending(int[] inputArr) {
        for (int i = inputArr.length - 1; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                if (inputArr[j] < inputArr[j + 1]) {
                    CommonUtil.swap(inputArr, j, j + 1);
                }
            }
        }
    }
}
