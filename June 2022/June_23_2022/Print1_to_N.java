package June_23_2022;

import java.util.Scanner;

public class Print1_to_N {
    public static void main(String[] args) {
        // Take Input
        // Print Num

      int num =  readInput();  
      printNum(num);    
    }



   static int readInput(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Number");
        int num = sc.nextInt();
        return num;
    }

    static void printNum(int n){
        for(int i = 1; i<=n; i++){
            System.out.println(i);
        }
    }

}
