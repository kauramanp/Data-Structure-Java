package sorting;

//taking middle element as pitvot

public class QuickSort {
    public int partition(int[] array, int lowerBound, int upperBound) {
        int i = lowerBound;
        int j = upperBound;
        int pivotElement = array[(lowerBound + upperBound) / 2];
        System.out.println("Pivot " + pivotElement + " lowerbound " + lowerBound + " higher bound " + upperBound);
        while (i <= j) {
            while (array[i] < pivotElement) {
                i++;
            }
            ;
            while (array[j] > pivotElement) {
                j--;
            }
            ;
            System.out.println("i " + i + " array[i] " + array[i] + " j " + j + " array[j] " + array[j]);
            if (i <= j) {
                int temp = array[i];
                array[i] = array[j];
                array[j] = temp;
                i++;
                j--;
                display(array, lowerBound, upperBound);
            }

        }

        return i;

    }

    public void quickSort(int array[], int lowerBound, int upperBound) {

        display(array, lowerBound, upperBound);
        int p = partition(array, lowerBound, upperBound);
        System.out.println("Returned value " + p);
        if (lowerBound < (p - 1)) {
            quickSort(array, lowerBound, p - 1);
        }
        if (p < upperBound) {
            quickSort(array, p, upperBound);

        }
    }

    public void display(int array[], int lowerBound, int upperBound) {
        System.out.println("lowerBound " + lowerBound + " upper bound " + upperBound);
        for (int i = lowerBound; i <= upperBound; i++) {
            System.out.print("\t" + array[i]);
        }
        System.out.println();
    }

    public static void main(String args[]) {
        QuickSort quickSort = new QuickSort();
        int[] array = { 12, 11, 13, 5, 6, 2 };
        // int[] array = { 12, 31, 25, 8, 32, 17, 40, 42 };
        // int[] array = { 1, 2, 3, 4, 5, 6, 7, 8 };
        // int[] array = { 15, 9, 7, 13, 12, 16, 4, 18, 11 };
        quickSort.quickSort(array, 0, array.length - 1);
        quickSort.display(array, 0, array.length - 1);
    }

}
