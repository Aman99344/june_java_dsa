package java_practice;
import java.util.Scanner;

public class PrimeOrNot {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        int count = 0;

        for(int i = 1; i<=num; i++){
            if(num % i == 0){
                count++;
            }
        }
        if(count == 2){
            System.out.println("Prime");

        }else {
            System.out.println("Not a prime");
        }
      

        
    }
}

// boolean isPrime = true;

//         for(int i = 2; i <num; i++){
//             if(num % i == 0){
//                 isPrime = false;
//                 break;
//             }
            
//         }
//         System.out.println(isPrime);



// int counter = 0;

//         for(int i = 1; i <= num; i++){
//             if(num % i == 0){ 

//                 counter ++;
                
//             }

//             if(counter == 2){
//                 System.out.println("Prime");
//             }
//         }