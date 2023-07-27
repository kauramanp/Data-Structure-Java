package searching;

import java.util.Scanner;

public class BinarySearch {
    public static void main(String args[]) {
        System.out.println("Enter the size of array");
        Scanner scanner = new Scanner(System.in);
        int size = scanner.nextInt();
        int[] array = new int[size];
        for (int i = 0; i < size; i++) {
            System.out.println("Enter the element to store at " + (i + 1) + " position");
            array[i] = scanner.nextInt();
        }

        System.out.println("Enter the element to search");
        int element = scanner.nextInt();

        int minLimit = 0;
        int maxLimit = array.length - 1;
        int middleElement;
        while (minLimit < maxLimit) {
            middleElement = (minLimit + maxLimit) / 2;
            if (array[middleElement] == element) {
                System.out.println("Element is found at " + middleElement);
                return;
            } else if (element < array[middleElement]) {
                maxLimit = middleElement;
            } else if (element > array[middleElement]) {
                minLimit = middleElement;
            }
        }
        System.out.println("Sorry element is not found");

    }
}
