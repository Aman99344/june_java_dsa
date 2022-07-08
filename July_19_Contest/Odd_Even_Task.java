package July_19_Contest;
import java.util.Scanner;

public class Odd_Even_Task {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        if(a % 2 == 0 && b % 2 == 0){
            System.out.println(a + b);
        }else if(a % 2 != 0 && b % 2 != 0){
            System.out.println(Math.abs(a - b));
        }else if(a % 2 == 0 && b % 2 != 0){
            System.out.println(a * b);
        }else if(a % 2 != 0 && b % 2 == 0){
            if(a > b){
                System.out.println(a/b);
            }else{
                System.out.println(b/a);
            }
        }


    }
    
}

//  There are two kids A and B. Both of them randomly speaks a number a and b, then perform a particular task according to certain conditions. Help them in performing the task according to following conditions.

// Condition:

// If A speaks an even number and B speakes an even number, then add both the numbers (a+b).
// If A speaks an odd number and B speakes an odd number, then subtract smaller from the greater number (a-b).
// If A speaks an even number and B speakes an odd number, then multiply both the numbers (a*b).
// If A speaks an odd number and B speakes an even number, then divide the greater number by smaller number ((max(a,b)//min(a,b)).
