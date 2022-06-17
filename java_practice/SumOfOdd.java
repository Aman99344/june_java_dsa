package java_practice;
import java.util.Scanner;

public class SumOfOdd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        int oddSum = 0;

        for(int i = 0; i <= num; i++){

            if(i % 2 == 1){
            
                oddSum = oddSum + i;
            }
        }System.out.println(oddSum);
 
       
    }

}

// 1 3 5 7 9