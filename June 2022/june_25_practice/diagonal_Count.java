package june_25_practice;

import java.util.Scanner;

public class diagonal_Count {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int row = sc.nextInt();
        // int count = 1;

        for(int i = 1; i<=row; i++){
            for(int j = 1; j<=row; j++){
                if(i == j){
                    System.out.print(i);
                }else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
