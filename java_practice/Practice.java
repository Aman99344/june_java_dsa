package java_practice;

import java.util.Scanner;

public class Practice {
    public static void main(String[] args) {
      
        // int num1 = 10;
        // int num2 = 8;

        // if(num1 > num2) {
        //     System.out.println(num1);
        // }else {
        //     System.out.println(num2);
        // }
    //  String firstName = "Aman";
    //  String lastName = "gupta";

    //  System.out.println(firstName + " " + lastName);

    //         Scanner sc = new Scanner(System.in);
    //            int num = sc.nextInt();
               
    //      if(num % 2 == 0){
    //         System.out.println("Even number");
    //      }else{
    //         System.out.println("Odd number");
    //      }

    //     Scanner sc = new Scanner(System.in);

    //    System.out.println("Enter is first name");

    //    String firstName = sc.next();

    //    System.out.println("Enter you last name");

    //    String lastName = sc.next();

    //    System.out.println(firstName + " " + lastName);

            Scanner sc = new Scanner(System.in);
            String s = sc.next();

            char c = s.charAt(0);

           int ascii = c;

           System.out.println(ascii);

            if(c >= 65 && c <= 90){
                System.out.println("Uppercase");
            }else{
                System.out.println("LowerCase");
            }


     }
}
