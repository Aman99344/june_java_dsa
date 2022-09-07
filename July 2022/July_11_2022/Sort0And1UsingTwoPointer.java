package July_11_2022;

import java.util.Arrays;

public class Sort0And1UsingTwoPointer {
    public static void main(String[] args) {
        int a[] = { 1, 0, 1, 1, 1, 0, 0, 1, 0, 1, 0 };

        int i = 0;
        int j = a.length - 1;

        while (i < j) {
            if (a[i] == 0) {
                i++;
            }
            if (a[j] == 1) {
                j--;
            }

            if (a[i] == 1 && a[j] == 0) {

                int temp = a[i];
                a[i] = a[j];
                a[j] = temp;

                i++;
                j--;
            }
        }

        System.out.println(Arrays.toString(a));

    }
}
