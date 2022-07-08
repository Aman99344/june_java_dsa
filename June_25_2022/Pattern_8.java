package June_25_2022;
import java.util.Scanner;
public class Pattern_8 {
    public static void main(String[] args) {
        Scanner sc  = new Scanner(System.in);
        int row = sc.nextInt();
        
        for(int i = 1; i<=row; i++){
            for(int j =4; j>=i-1; j--){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    
}
