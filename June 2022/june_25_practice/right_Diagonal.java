package june_25_practice;

import java.util.Scanner;

public class right_Diagonal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int row = sc.nextInt();
        int col = sc.nextInt();

        for(int i = 1; i<=row; i++){
            for(int j = col; j>=i; j--){
                if(j > i){
                    System.out.print(" ");
                }else{
                    System.out.print("*");
                }
            }
            System.out.println();
        }
    }
}
