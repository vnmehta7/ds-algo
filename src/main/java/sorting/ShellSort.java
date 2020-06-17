package sorting;

public class ShellSort {

    public void sortAscending(int[] inputArr) {
        for (int gap = inputArr.length / 2; gap > 0; gap /= 2) {
            for (int i = gap; i < inputArr.length; i++) {
                int j = i;
                int newElement = inputArr[i];
                while (j >= gap && inputArr[j - gap] > newElement) {
                    inputArr[j] = inputArr[j - gap];
                    j = j - gap;
                }
                inputArr[j] = newElement;
            }
        }
    }

    public void sortDescending(int[] inputArr) {
        for (int gap = inputArr.length / 2; gap > 0; gap /= 2) {
            for (int i = gap; i < inputArr.length; i++) {
                int j = i;
                int newElement = inputArr[i];
                while (j >= gap && inputArr[j - gap] < newElement) {
                    inputArr[j] = inputArr[j - gap];
                    j = j - gap;
                }
                inputArr[j] = newElement;
            }
        }
    }
}
