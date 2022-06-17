package java_practice;
import java.util.Scanner;
public class Even_Divisible_3_4 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        int sum = 0;

        for(int i = 1; i<=num; i++){

            if(i % 2 == 0 && i % 3 == 0 && i % 4 == 0){

                System.out.println(i);
            }

            
        }
        
       
    }
    
}
