package June_25_2022;

import java.util.Scanner;

public class Diagonal_Number_Pattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int row = sc.nextInt();
        int col = sc.nextInt();
        int count = 1;

        for(int i = 1; i<=row; i++){

            for(int j = 1; j<=col; j++){
                if(i == j){
                    System.out.print(count++);
                }else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    

        
    }
}
