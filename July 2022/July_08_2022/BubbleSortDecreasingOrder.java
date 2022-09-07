package July_08_2022;

import java.util.Arrays;

public class BubbleSortDecreasingOrder {
    public static void main(String[] args) {
        int a[] = { 1, 3, 2, 4 };

        for (int i = 0; i < a.length - 1; i++) {
            System.out.println("-----------------");
            System.out.println("Pass -->" + (i + 1));
            for (int j = 0; j < a.length - 1 - i; j++) {
                if (a[j] < a[j + 1]) {
                    int temp = a[j];
                    a[j] = a[j + 1];
                    a[j + 1] = temp;
                }
                System.out.println(Arrays.toString(a));
            }
        }

        System.out.println();
        System.out.println("-------End result ------");
        System.out.println(Arrays.toString(a));
    }
}
