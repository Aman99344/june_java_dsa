package July_01_2022;

import java.util.Scanner;

public class PrintUserInput {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the size");
        int n = sc.nextInt();

        int a[] = new int[n];
        System.out.println("Enter the elements");
        for (int i = 0; i < a.length; i++) {
            a[i] = sc.nextInt();
        }

        for (int i = 0; i < a.length; i++) {
            System.out.println(a[i]);
        }

    }
}
