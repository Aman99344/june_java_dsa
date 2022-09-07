package June_25_2022;
import java.util.Scanner;
public class ReverseDiagonal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int row = sc.nextInt();
        int col = sc.nextInt();
        
        for(int i = 1; i<=row; i++){

            for(int j = col; j>0; j--){
                if( i == j){
                    System.out.print("*");
                }else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }



    }
}


// for(int i = 0; i<row; i++){

//     for(int j = 0; j<=col; j++){
//         if( j == (col - i)){
//             System.out.print("*");
//         }else{
//             System.out.print(" A ");
//         }
//     }
//     System.out.println();
// }