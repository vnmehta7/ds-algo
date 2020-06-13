package sorting;

public class CommonUtil {

    public static void swap(int[] inputArr, int i, int j) {
        if (i == j) {
            return;
        }
        int temp = inputArr[j];
        inputArr[j] = inputArr[i];
        inputArr[i] = temp;
    }
}
