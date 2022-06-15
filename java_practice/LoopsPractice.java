package java_practice;

import java.util.Scanner;

public class LoopsPractice {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the count");
        int count = sc.nextInt();

        System.out.println("Enter the message");
        sc.nextLine();
        String msg = sc.nextLine();

       

        for(int i = 0; i< count; i++){
            System.out.println(i + msg);
        }
    }
    
}
