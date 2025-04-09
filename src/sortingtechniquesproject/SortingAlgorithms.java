
package sortingtechniquesproject;


public class SortingAlgorithms {

    public static void bubbleSort(int[] arr) {
        boolean swapped = true;
        for (int i = 0; i < arr.length - 1 && swapped; i++) {
            swapped = false;
            for (int j = 0; j < arr.length - i - 1; j++) {
                if (arr[j + 1] < arr[j]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    swapped = true;
                }
            }
        }
    }
}
    