package June_22_2022;
import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int rev = 0;
        int temp = num;
       
       while(num > 0){
        int digit = num % 10;
        rev = rev * 10 + digit;

        num = num / 10;
       }
      // System.out.println(rev);
    
       
        if(temp == rev){
            System.out.println("Palidrom");
        }else{
            System.out.println("Not Palidrom");
       }
        

    }
}
