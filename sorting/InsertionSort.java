package sorting;

import java.util.Scanner;

public class InsertionSort {
    public static void main(String args[]) {
        System.out.println("Enter the size of array");
        Scanner scanner = new Scanner(System.in);
        // int size = scanner.nextInt();
        int size = 5;
        // int[] array = new int[size];
        // for (int i = 0; i < size; i++) {
        // System.out.println("Enter the element to store at " + (i + 1) + " position");
        // array[i] = scanner.nextInt();
        // }
        int[] array = { 12, 11, 13, 5, 6 };

        for (int i = 1; i < array.length; i++) {
            int temp = array[i];
            int j = i - 1;
            for (; (j >= 0 && array[j] > temp); j--) {
                array[j + i] = array[j];
            }
            array[j + 1] = temp;
        }

        System.out.println("Sorted array");
        for (int i = 1; i < len; i++) {
            int key = arr[i];
            int j = i - 1;
            for (; (j >= 0 && arr[j] > key); j--) {
                arr[j + 1] = arr[j];
            }
            arr[j + 1] = key;
        }
    }
}
