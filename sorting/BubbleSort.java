package sorting;

//it takes the largest number to the last position 
//then moves to next iteration by decreasing the size by 1 as the largest element is set
/*
 *  After sorting Phase 1
        42      35      12      77      5       101
    After sorting Phase 2
        35      12      42      5       77      101
    After sorting Phase 3
        12      35      5       42      77      101
    After sorting Phase 4
        12      5       35      42      77      101
    After sorting Phase 5
        5       12      35      42      77      101
    After sorting Phase 6
        5       12      35      42      77      101
    After sorting
        5       12      35      42      77      101
 */
public class BubbleSort {
    public static void main(String args[]) {
        int[] a = { 77, 42, 35, 12, 101, 5 };
        // int[] a = {100, 2,4,1,56,23,9};
        // int[] a = {3,60,35,2,45,320,5};
        int size = a.length;
        int temp = 0;
        for (int i = 0; i < size; i++) {
            for (int j = 1; j < (size - i); j++) {
                if (a[j - 1] > a[j]) {
                    temp = a[j - 1];
                    a[j - 1] = a[j];
                    a[j] = temp;
                }
            }
            System.out.println("After sorting Phase " + (i + 1));
            for (int k = 0; k < a.length; k++) {
                System.out.print("\t" + a[k]);
            }
            System.out.println();
        }

        System.out.println("After sorting");
        for (int i = 0; i < a.length; i++) {
            System.out.print("\t" + a[i]);
        }
    }
}
