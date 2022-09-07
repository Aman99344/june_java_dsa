package June_22_2022;

import java.util.Scanner;

public class Count_Number {
    public static void main(String[] args) {
        System.out.println("Enter the number ");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
       
        sc.close();
        int counter = 0;
        // int sum = 0;

        while(num > 0){
          // int digit =   num % 10;
          counter++;
          num = num/10;
        
          
        
        }
        System.out.println(counter);
    }
}
