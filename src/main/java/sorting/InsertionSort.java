package sorting;


public class InsertionSort {

    public void sortAscending(int[] inputArr) {
        for (int i = 1; i < inputArr.length; i++) {
            int newElement = inputArr[i];
            int j;
            for (j = i; j > 0 && inputArr[j - 1] > newElement; j--) {
                inputArr[j] = inputArr[j - 1];
            }
            inputArr[j] = newElement;
        }
    }

    public void sortDescending(int[] inputArr) {
        for (int i = 1; i < inputArr.length; i++) {
            int newElement = inputArr[i];
            int j;
            for (j = i; j > 0 && inputArr[j - 1] < newElement; j--) {
                inputArr[j] = inputArr[j - 1];
            }
            inputArr[j] = newElement;
        }
    }
}
