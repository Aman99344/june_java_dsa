package java_practice;
import java.util.Scanner;

public class Month {
    public static void main(String[] arg){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        
        if(n == 1){
             System.out.println("January");    
        }

       else if (n == 2){
            System.out.println("February");
         }

         else if (n == 3){
            System.out.println("march");
         }

         else if(n == 4){
            System.out.println("April");
         }

         else if(n == 5){
            System.out.println("May");
         }

         else if(n == 6){
            System.out.println("june");
         }

         else if(n == 7){
            System.out.println("July");
         }

         else if(n == 8){
            System.out.println("August");
         }

         else if(n == 9){
            System.out.println("Septemper");
         }

         else if(n == 10){
            System.out.println("October");
         }

         else if(n == 11){
            System.out.println("November");
         }
         else if(n == 12){
            System.out.println("December");
         } else {
            System.out.println("Enter the valid month");
         }
    }
}
