package June_28_2022;

import java.util.Scanner;

public class right_Pascal_Hackerrank10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for(int i = 1; i<=n; i++){
            for(int j = 1; j<=n; j++){
               if(j<=i){
                System.out.print("* ");
               }else{
                System.out.print(" ");
               }
            }
            System.out.println();
        }

        for(int i = 1; i<=n; i++){
            for(int j = n; j>=1; j--){
                if(j>i){ 
                    System.out.print("* ");
                }else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }

    }
}
