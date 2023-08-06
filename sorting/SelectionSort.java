package sorting;

//Selection Sort Algorithm
/*
 *  After sorting Phase 1
        5       42      35      12      101     77
    After sorting Phase 2
        5       12      35      42      101     77
    After sorting Phase 3
        5       12      35      42      101     77
    After sorting Phase 4
        5       12      35      42      101     77
    After sorting Phase 5
        5       12      35      42      77      101
    After sorting
        5       12      35      42      77      101
 */

public class SelectionSort {
    public static void main(String args[]) {
        int a[] = { 77, 42, 35, 12, 101, 5 };
        for (int i = 0; i < (a.length - 1); i++) {
            int jIndex = i;
            for (int j = i + 1; j < a.length; j++) {
                if (a[j] < a[jIndex]) {
                    jIndex = j;
                }
            }
            int temp = a[jIndex];
            a[jIndex] = a[i];
            a[i] = temp;

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
