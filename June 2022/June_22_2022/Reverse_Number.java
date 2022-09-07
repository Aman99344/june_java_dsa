package June_22_2022;

import java.util.Scanner;

public class Reverse_Number {
    public static void main(String[] args) {
        System.out.println("Enter the number ");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        while(num > 0){
            int digit = num % 10;
            System.out.print(digit);

            num = num / 10;
        }

     


    }
}
