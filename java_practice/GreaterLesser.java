package java_practice;
import java.util.Scanner;
public class GreaterLesser {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int num = sc.nextInt();
        
        if(num > 10){
            System.out.println("Greate than 10");
          
        }else {
            
            if(num < 5){
                System.out.println("Less tha 5");
            }else{
                System.out.println("Greate than 5");
            }
        }

        }
    }

