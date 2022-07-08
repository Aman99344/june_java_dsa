package june_25_practice;

import java.util.Scanner;

public class pattern1_Practice {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int row = sc.nextInt();
       
        
        for(int i = 1; i<=row; i++){
            for(int j = row; j>=1; j--){
                 if(j<=i){
                    System.out.print("*");
                 }else{
                    System.out.print(" ");
                 }
            }
            System.out.println();
        }



    }
}
