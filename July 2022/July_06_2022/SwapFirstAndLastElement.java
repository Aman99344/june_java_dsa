package July_06_2022;

import java.util.Arrays;

public class SwapFirstAndLastElement {
    public static void main(String[] args) {

        int a[] = { 2, 4, 78, 89, 5 };

        if (a.length >= 2) {
            int temp = a[0];

            a[0] = a[a.length - 1];

            a[a.length - 1] = temp;
        }

        System.out.println(Arrays.toString(a));

    }
}
