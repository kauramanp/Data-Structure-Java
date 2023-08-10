package sorting;

public class MergeSort {
    public void divideArray(int[] array, int lowerBound, int upperBound) {
        if (lowerBound < upperBound) {
            int middleElement = (lowerBound + upperBound) / 2;
            divideArray(array, lowerBound, middleElement);
            divideArray(array, middleElement + 1, upperBound);
            mergeArray(array, lowerBound, middleElement, upperBound);
        }
    }

    public void mergeArray(int[] array, int lowerBound, int middleElement, int upperBound) {
        int b[] = new int[array.length];
        int i = lowerBound;
        int j = middleElement + 1;
        int k = lowerBound;
        while (i <= middleElement && j <= upperBound) {
            if (array[i] < array[j]) {
                b[k] = array[i];
                i++;
                k++;
            } else {
                b[k] = array[j];
                j++;
                k++;
            }
        }

        while (i <= middleElement) {
            b[k] = array[i];
            i++;
            k++;
        }

        while (j <= upperBound) {
            b[k] = array[j];
            j++;
            k++;
        }

        for (i = lowerBound; i <= upperBound; i++) {
            array[i] = b[i];
        }
    }

    public void display(int array[], int lowerBound, int upperBound) {
        for (int i = lowerBound; i <= upperBound; i++) {
            System.out.print("\t" + array[i]);
        }
        System.out.println();
    }

    public static void main(String args[]) {
        MergeSort mergeSort = new MergeSort();
        // int[] array = { 12, 11, 13, 5, 6 };
        // int[] array = { 12, 31, 25, 8, 32, 17, 40, 42 };
        int[] array = { 1, 2, 3, 4, 5, 6, 7, 8 };
        mergeSort.divideArray(array, 0, array.length - 1);
        mergeSort.display(array, 0, array.length - 1);
    }
}