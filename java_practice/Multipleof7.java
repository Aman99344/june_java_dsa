package java_practice;

import java.util.Scanner;

public class Multipleof7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();

        int count = num / 7;

        for(int i = 0; i <= count; i++){
            int val = 7 * i;
            System.out.print(val + " ");
        }
    }
}
