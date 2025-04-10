
package sortingtechniquesproject;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Input array size: ");
        int size = scanner.nextInt();

        int[] numbers = new int[size];

        System.out.println("Input array elements:");
        for (int i = 0; i < size; i++) {
            System.out.print("Element " + (i + 1) + ": ");
            numbers[i] = scanner.nextInt();
        }

        System.out.println();
        System.out.println("Sorting Techniques:");

        int[] bubbleSortedNumbers = numbers.clone();
        SortingAlgorithms.bubbleSort(bubbleSortedNumbers);
        System.out.print("Bubble Sort: ");
        printArray(bubbleSortedNumbers);
    
    int[] selectionSortedNumbers = numbers.clone();
SortingAlgorithms.selectionSort(selectionSortedNumbers);
System.out.print("Selection Sort: ");
printArray(selectionSortedNumbers);}

    public static void printArray(int[] arr) {
        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
}

