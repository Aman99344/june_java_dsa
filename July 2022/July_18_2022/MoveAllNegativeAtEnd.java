package July_18_2022;

import java.util.Arrays;

public class MoveAllNegativeAtEnd {
    public static void main(String[] args) {

        int a[] = { 1, -1, 3, 2, -7, -5, 11, 6 };

        int b[] = new int[a.length];
        int j = 0;

        for (int i = 0; i < a.length; i++) {
            if (a[i] > 0) {

                b[j] = a[i];
                j++;
            }
        }

        for (int i = 0; i < a.length; i++) {
            if (a[i] < 0) {
                b[j] = a[i];
                j++;
            }
        }
        a = b;
        System.out.println(Arrays.toString(a));

    }
}
