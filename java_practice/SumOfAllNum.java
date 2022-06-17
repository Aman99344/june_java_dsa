package java_practice;

import java.util.Scanner;

public class SumOfAllNum {
public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int num = sc.nextInt();

    int sum = 0;

    for(int i = 0; i <= num; i++){
        sum = sum + i;
    }
   System.out.println(sum);
 
}
    
}

// 0 1 2 3 4 5 6 7