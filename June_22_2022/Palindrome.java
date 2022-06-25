package June_22_2022;
import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int digit = 0;

        while(num > 0){
            digit = num % 10;
            System.out.print(digit);
           int num1 = num / 10;

        }
        // if(num == digit){
        //     System.out.println("Palidrom");
        // }else{
        //     System.out.println("Not Palidrom");
        // }
        

    }
}
