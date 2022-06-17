package java_practice;
import java.util.Scanner;

public class DemoOfBreakAndContinue {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        for(int i = 0; i<=num; i++){
            if(i % 2 != 0){
                continue;
            }
            System.out.println(i);
        }
        
    }
    
}


// for(int i = 1; i<= num; i++){
        //     if(i % 5 != 0){

        //         System.out.println(i);
        //     }
        // }


        // for(int i = 1; i<= num; i++){
        //     if(i % 5 == 0){
        //         continue;
        //     }
        //     System.out.println(i);
        // }