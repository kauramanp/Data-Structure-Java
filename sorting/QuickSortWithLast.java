package sorting;

public class QuickSortWithLast {

    public int partition(int arr[], int low, int high) {
        int pivot = arr[high];
        int pIndex = low;
        System.out.println("pivot " + pivot + " i " + low + " high " + high);

        for (int j = low; j <= high - 1; j++) {
            if (arr[j] <= pivot) {
                int temp = arr[j];
                arr[j] = arr[pIndex];
                arr[pIndex] = temp;
                System.out.print("After swapping i " + pIndex + " j " + j + " ");
                display(arr, 0, arr.length - 1);

                pIndex = pIndex + 1;

            }
        }

        int temp = arr[pIndex];
        arr[pIndex] = arr[high];
        arr[high] = temp;
        display(arr, 0, arr.length - 1);
        System.out.println("Returing pIndex " + pIndex);

        return pIndex;
    }

    public void quickSort(int arr[], int low, int high) {
        if (low < high) {

            // partitioning the single array into two sub-arrays
            int pi = partition(arr, low, high);

            // sorting the sub-arrays
            quickSort(arr, low, pi - 1);
            quickSort(arr, pi + 1, high);
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
        QuickSortWithLast quickSort = new QuickSortWithLast();
        int[] array = { 12, 11, 13, 5, 6, 2 };
        // int[] array = { 1, 3, 9, 8, 2, 7, 5 };
        // int[] array = { 12, 31, 25, 8, 32, 17, 40, 42 };
        // int[] array = { 1, 2, 3, 4, 5, 6, 7, 8 };
        // int[] array = { 15, 9, 7, 13, 12, 16, 4, 18, 11 };
        quickSort.quickSort(array, 0, array.length - 1);
        quickSort.display(array, 0, array.length - 1);
    }
}
