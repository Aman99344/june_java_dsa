package July_19_Contest;
import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        // A teacher is explaining factorial to the students. Since, the calculation involved in factorial is a bit difficult for him to do. The teacher wants to write a program, so that he doesn't need to calculate the factorial of every number. You have to help the teacher in writing a program for factorial calculation.
        //  Take an integer N as input.

        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
            int fact = 1;
        for(int i = 1; i<=num; i++){
           
            fact = fact * i;

        }
        System.out.println(fact);

    }
}
