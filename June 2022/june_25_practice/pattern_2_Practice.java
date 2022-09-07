package june_25_practice;

import java.util.Scanner;

public class pattern_2_Practice {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int row = sc.nextInt();

        for(int i = 1; i<=row; i++){
            for(int j = row; j>i; j--){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
