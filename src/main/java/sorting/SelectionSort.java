package sorting;


public class SelectionSort {

    public int[] sortAscending(int[] inputArr) {
        for (int i = inputArr.length - 1; i > 0; i--) {
            int greater = 0;
            for (int j = 1; j <= i; j++) {
                if (inputArr[j] > inputArr[greater]) {
                    greater = j;
                }
            }
            CommonUtil.swap(inputArr, greater, i);
        }
        return inputArr;
    }

    public int[] sortDescending(int[] inputArr) {
        for (int i = inputArr.length - 1; i > 0; i--) {
            int greater = 0;
            for (int j = 1; j <= i; j++) {
                if (inputArr[j] < inputArr[greater]) {
                    greater = j;
                }
            }
            CommonUtil.swap(inputArr, greater, i);
        }
        return inputArr;
    }
}
