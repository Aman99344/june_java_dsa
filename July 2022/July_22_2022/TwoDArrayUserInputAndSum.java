package July_22_2022;

import java.util.Scanner;

public class TwoDArrayUserInputAndSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the row");
        int row = sc.nextInt();

        System.out.println("Enter the column");
        int col = sc.nextInt();


        System.out.println("Enter the number");

        int a[][]= new int [row][col];

        for(int i = 0; i<row; i++){
            for(int j = 0; j<col; j++){
                a[i][j] = sc.nextInt();
            }
        }

            int sum = 0;

        for(int i = 0; i<row; i++){
            for(int j =0; j<col; j++){
                System.out.print(a[i][j] + " ");
                sum = sum + a[i][j];
            }

            System.out.println();
            
        }

        System.out.println(sum);



    }
}
