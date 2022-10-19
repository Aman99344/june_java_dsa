package July_23_2022;

import java.util.Scanner;

public class TwoDArrayIncrement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the row");
        int row = sc.nextInt();

        System.out.println("Enter the column");
        int col = sc.nextInt();

        int a[][] = new int[row][col];

        int count = 1;

        for(int i = 0; i<row; i++){
            for(int j = 0; j<col; j++){
                System.out.print(a[i][j] = count);
                System.out.print(" ");
                count++;
               
            }
            System.out.println();
        }
    }
}
