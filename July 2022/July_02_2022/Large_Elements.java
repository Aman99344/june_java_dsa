package July_02_2022;

import java.util.Scanner;

public class Large_Elements {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size");
        int n = sc.nextInt();

        int a[] = new int[n];

        System.out.println("Enter the elements");
        for (int i = 0; i < a.length; i++) {
            a[i] = sc.nextInt();

        }

        int large = 0;

        for (int i = 0; i < a.length; i++) {
            if (a[i] > large) {
                large = a[i];
            }
        }
        System.out.println(large);
    }
}
