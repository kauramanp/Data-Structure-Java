package searching;

import java.util.Scanner;

class LinearSearch {
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
        for (int i = 0; i < size; i++) {
            if (array[i] == element) {
                System.out.println("Element found at " + (i + 1) + " position");
                break;
            }
        }

    }
}