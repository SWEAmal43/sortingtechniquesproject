
package sortingtechniquesproject;


public class SortingAlgorithms {

    public static void bubbleSort(int[] arr) {
        boolean swapped = true;
        int swapCount=0;
        for (int i = 0; i < arr.length - 1 && swapped; i++) {
            swapped = false;
            for (int j = 0; j < arr.length - i - 1; j++) {
                if (arr[j + 1] < arr[j]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    swapped = true;
                    swapCount++;
                }
            }
        }
        System.out.println("Swaps in bubble sort Done :"+ swapCount);
    }
    public static void selectionSort(int[] arr) {
    for (int i = 0; i < arr.length - 1; i++) {
        int minIndex = i;
        for (int j = i + 1; j < arr.length; j++) {
            if (arr[j] < arr[minIndex]) {
                minIndex = j;
            }
        }
        int temp = arr[minIndex];
        arr[minIndex] = arr[i];
        arr[i] = temp;
    }
}
}
    