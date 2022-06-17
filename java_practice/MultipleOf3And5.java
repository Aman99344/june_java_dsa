package java_practice;

import java.util.Scanner;

public class MultipleOf3And5 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        for(int i = 1; i<=num; i++){
          if(i % 3 == 0 || i % 5 == 0){
            System.out.print(i + " ");
          }

          // else if(i % 3 == 0){
          //   System.out.print(i + " ");

          // }
          // else if(i % 5 == 0){
          //   System.out.print(i + " ");
          // }
        }

     




    }
}
 // 3 5 6 9 10 12 15 18 20 21 24 25 27 30 33 35 36 39 40 42 45 48 50 51 54 55 57 60 63 65 66 
          
//  for(int i = 1; i<= num; i++){
//   if(i % 3 == 0 && i % 5 == 0 ){
     
//       System.out.print(i + " ");

//     }else if(i % 3 == 0){
//       System.out.print(i + " ");

//     } else if(i % 5 == 0){
//       System.out.print(i + " ");
//     }
// }