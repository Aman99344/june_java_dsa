package June_24_2022;

import java.util.Scanner;

public class Pattern_6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int rowSize = sc.nextInt();
        int colSize = sc.nextInt();
        int count = 1;
        for(int i = 1; i<=rowSize; i++){
            for(int j = 1; j<=colSize; j++){
                System.out.print(count++ + " ");
            }
            System.out.println();
        }

    }
}
