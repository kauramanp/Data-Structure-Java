package sorting;

public class MergeSort {
    public void divideArray(int[] array, int lowerBound, int upperBound) {
        if (lowerBound < upperBound) {
            int middleElement = (lowerBound + upperBound) / 2;
            divideArray(array, lowerBound, middleElement);
            divideArray(array, middleElement + 1, upperBound);
            mergeArray(array, lowerBound, upperBound, middleElement);
        }
    }

    public void mergeArray(int[] array, int lowerBound, int upperBound, int middleElement) {
        int b[] = new int[array.length];
        int i = lowerBound;
        int j = middleElement + 1;
        int k = lowerBound;
        while (i <= middleElement && j <= upperBound) {
            System.out.println("i " + i + " j " + j + " k " + k);
            if (array[i] < array[j]) {
                b[k] = array[i];
                i++;
                k++;
            } else if (array[i] > array[j]) {
                b[k] = array[j];
                j++;
                k++;
            }
        }

        while (i < middleElement) {
            array[k] = array[i];
            i++;
            k++;
        }

        while (j < upperBound) {
            array[k] = array[j];
            j++;
            k++;
        }
    }

    public static void main(String args[]) {
        MergeSort mergeSort = new MergeSort();
        int[] array = { 12, 11, 13, 5, 6 };
        mergeSort.divideArray(array, 0, array.length);
        for (int i = 0; i < array.length; i++) {
            System.out.println("\t" + array[i]);
        }
    }
}