package java_practice;

import java.util.Scanner;

public class NumNotNegative {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number");
        int num = sc.nextInt();

        if((num > 0) && (num % 6 == 0)){
         System.out.println("Match");

        }else{
            System.out.println("Not Matched");
        }

        

    }
}
