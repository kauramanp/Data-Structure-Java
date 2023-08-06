package sorting;

/*
 * After sorting Phase 2
        11      12      13      5       6
    After sorting Phase 3
        11      12      13      5       6
    After sorting Phase 4
        5       11      12      13      6
    After sorting Phase 5
        5       6       11      12      13
    After sorting
        5       6       11      12      13
 */
public class InsertionSort {
    public static void main(String args[]) {
        int[] array = { 12, 11, 13, 5, 6 };

        for (int i = 1; i < array.length; i++) {
            int key = array[i];
            int j = i - 1;
            while (j >= 0 && array[j] > key) {
                array[j + 1] = array[j];
                j--;
            }
            array[j + 1] = key;
            System.out.println("After sorting Phase " + (i + 1));
            for (int k = 0; k < array.length; k++) {
                System.out.print("\t" + array[k]);
            }
            System.out.println();
        }

        System.out.println("After sorting");
        for (int i = 0; i < array.length; i++) {
            System.out.print("\t" + array[i]);
        }
    }
}
