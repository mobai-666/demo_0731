package pack02_quickSort;

import java.util.Arrays;

public class Quick {
    public static void main(String[] args) {
        int[] a = {5, 6, 9, 1, 2, -9, -2, 0, 1};
        s(0, a.length - 1, a);
        System.out.println(Arrays.toString(a));
    }

    public static void s(int low, int high, int[] a) {
        int i = low;
        int j = high;
        int temp = 0;
        while (i < j) {
            while (a[j] > a[i]) {
                j--;
            }
            if (i < j) {
                temp = a[i];
                a[i] = a[j];
                a[j] = temp;
                i++;
            }
            while (a[i] < a[j]) {
                i++;
            }
            if (i < j) {
                temp = a[i];
                a[i] = a[j];
                a[j] = temp;
                j--;
            }
            if (i > low) {
                s(low, i - 1, a);
            }
            if (j < high) {
                s(i + 1, high, a);
            }
        }


    }

}

