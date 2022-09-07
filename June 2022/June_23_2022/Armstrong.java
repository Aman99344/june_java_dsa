package June_23_2022;

import java.util.Scanner;

public class Armstrong {

    public static void main(String[] args) {
        // readInput
        // checkArmsAtrong

        int num = readInput();
        checkArmsAtrong(num);
    }

    static int readInput() {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        return num;
    }

    static void checkArmsAtrong(int num) {
        int sum = 0;
        int temp = num;
        while (num > 0) {
            int digit = num % 10;
            int cube = digit * digit * digit;
            sum = sum + cube;
            num = num / 10;
        }
        if (sum == temp) {
            System.out.println("ArmsStrong");

        } else {
            System.out.println("Not ArmStrong");
        }

    }

}
