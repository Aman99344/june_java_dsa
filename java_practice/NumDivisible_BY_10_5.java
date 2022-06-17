package java_practice;

import java.util.Scanner;

public class NumDivisible_BY_10_5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        // for(int i = 1; i<= num; i++ ){
        // if(i % 6 == 0 && i % 9 == 0){
        // System.out.println(i);
        // break;
        // }

        // }

        for (int i = 1; i <= num; i++) {
            if (i % 5 == 0 && i % 10 == 0) {
                System.out.println(i);
            }

        }

    }
}
