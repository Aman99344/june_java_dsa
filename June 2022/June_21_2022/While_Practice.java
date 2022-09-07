package June_21_2022;

import java.util.Scanner;

public class While_Practice {
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       int num = sc.nextInt();
       sc.nextLine();

       int i = 1;
       String s = "Hello ";

       while(i<=num){
            System.out.println("Enter your Name: ");

            s = s + sc.nextLine()+" ";
            // String msg = sc.nextLine();
            i++;
              
            // s = s + msg + " ";    
         }
         System.out.println(s);
    }

}
