package July_23_2022;
import java.util.Scanner;
public class TwoDArrayAlbhabet {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the row");
        int row = sc.nextInt();

        System.out.println("Enter the column");
        int col = sc.nextInt();

        char c[][] = new char[row][col];

        char ch = 'A';

        for(int i =0; i<row; i++){
            for(int j = 0; j<col; j++){
                System.out.print(c[i][j] = ch++);
                System.out.print(" ");
            }
            System.out.println();
        }


    }
}
