package sorting;

public class HeapSort {
    public static void main(String args[]) {
        int[] array = { 22, 13, 17, 11, 10, 14, 12 };
        HeapSort heapSort = new HeapSort();
        heapSort.sort(array);
        heapSort.display(array);
    }

    public void display(int array[]) {
        for (int i = 0; i <= (array.length - 1); i++) {
            System.out.print("\t" + array[i]);
        }
        System.out.println();
    }

    void sort(int[] array) {
        int length = array.length;
        for (int i = (length / 2 - 1); i >= 0; i--) {
            heapify(array, length, i);
        }

        for (int i = (length - 1); i >= 0; i++) {
            int temp = array[0];
            array[0] = array[i];
            array[i] = temp;

            heapify(array, i, 0);
        }
    }

    public void heapify(int[] array, int n, int i) {
        int largest = i;
        int left = (2 * i) + 1;
        int right = (2 * i) + 2;

        if (left < n && array[left] > array[largest]) {
            largest = left;
        }

        if (right < n && array[right] > array[largest]) {
            largest = right;
        }

        if (largest != i) {
            int temp = array[i];
            array[i] = array[largest];
            array[largest] = temp;
            heapify(array, n, largest);
        }

    }
}
