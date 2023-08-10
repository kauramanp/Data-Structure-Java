package sorting;

public class QuickSort {
    public int partition(int[] array, int lowerBound, int upperBound) {
        int i = lowerBound;
        int j = upperBound;
        int pivotElement = array[lowerBound];
        while (i < j) {
            do {
                i++;
            } while (array[i] <= pivotElement);
            do {
                j--;
            } while (array[j] > pivotElement);
            if (i < j) {
                int temp = array[i];
                array[i] = array[j];
                array[j] = temp;
            }

        }
        int temp = array[lowerBound];
        array[lowerBound] = array[j];
        array[j] = temp;
        return j;

    }

    public void quickSort(int array[], int lowerBound, int upperBound) {

        if (lowerBound < upperBound) {
            display(array, lowerBound, upperBound);
            int p = partition(array, lowerBound, upperBound);
            quickSort(array, lowerBound, p);
            quickSort(array, p + 1, upperBound);
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
        quickSort.quickSort(array, 0, array.length - 1);
        quickSort.display(array, 0, array.length - 1);
    }

}
