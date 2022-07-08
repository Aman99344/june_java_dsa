package June_24_2022;
import java.util.Scanner;
public class Pattern_7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int row = sc.nextInt();
        int col = sc.nextInt();
        int count = 0;
        
        for(int i = 1; i<=row; i++){
            count++;
           int x = count;
            for(int j = 1; j<=col; j++){
                System.out.print(x + " ");
                x = x + row;
            }
            System.out.println();
        }
    }
}
