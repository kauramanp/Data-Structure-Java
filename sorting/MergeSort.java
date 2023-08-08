package sorting;

public class MergeSort {
    public void divideArray(int[] array, int lowerBound, int upperBound) {
        if (lowerBound < upperBound) {
            int middleElement = (lowerBound + upperBound) / 2;
            divideArray(array, lowerBound, middleElement - 1);
            divideArray(array, middleElement + 1, upperBound);
            mergeArray(array, lowerBound, upperBound, middleElement);
        }
    }

    public void mergeArray(int[] array, int lowerBound, int upperBound, int middleElement) {
        int inSorting;
        if (array[lowerBound] > array[upperBound]) {
            inSorting = array[lowerBound];
            array[lowerBound] = inSorting;
        }
    }

    public static void main(String args[]) {
        MergeSort mergeSort = new MergeSort();
        int[] array = { 12, 11, 13, 5, 6 };
        mergeSort.divideArray(array, 0, array.length);

    }
}