package June_27_2022;

import java.util.Scanner;

public class hackerRank6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int row = sc.nextInt();

        for(int i = 1; i<=row; i++){
            for(int j = 1; j<=row; j++){
                if(j>=i){
                    System.out.print("*");
                }else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
