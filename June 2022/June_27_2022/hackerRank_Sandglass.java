package June_27_2022;

import java.util.Scanner;

public class hackerRank_Sandglass {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        inversePyramid(n);
        pyramid(n);
    }

      static void inversePyramid(int n){
        for(int i = 1; i<=n; i++){
            for(int j = 1; j<=n; j++){
                if(j>=i){
                    System.out.print("* ");
                }else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
      }


      static void pyramid(int n){
        for(int i = 1; i<=n; i++){
            for(int j = n; j>=1; j--){
                if(j<=i){
                    System.out.print("* ");
                }else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
      }

}
