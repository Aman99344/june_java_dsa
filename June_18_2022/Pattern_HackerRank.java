package June_18_2022;
import java.util.Scanner;
public class Pattern_HackerRank {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        for(int i = 1; i<=num; i++){
                for(int j = num; j>=num; j--){
                    System.out.print(j);
                }
                System.out.println();
        }
    }
}




// 1 2 3 4 5 
// 1 2 3 4 
// 1 2 3 
// 1 2 
// 1 