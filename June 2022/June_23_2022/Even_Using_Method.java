package June_23_2022;

import java.util.Scanner;

public class Even_Using_Method {
    public static void main(String[] args) {

        int num = readInput();
        evenCheck(num);
    }

    static int readInput() {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        return num;
    }

    static void evenCheck(int a) {
        if (a % 2 == 0) {
            System.out.println("Even");
        } else {

            System.out.println("Not Even");
        }

    }

}
