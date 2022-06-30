package June_23_2022;

import java.util.Scanner;

public class Multiplication {
    public static void main(String[] args) {
        // read input
        // printTble

        int num = readInput();
        printTable(num);

    }

    static int readInput() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int num = sc.nextInt();
        return num;
    }

    static void printTable(int t) {

        for (int i = 1; i <= 10; i++) {
            System.out.println(t + " " + "*" + " " + i + "  = " + " " + t * i);
        }

    }

}
