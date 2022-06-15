package java_practice;
import java.util.Scanner;

public class SquareOfNum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number");
        int num = sc.nextInt();

        

        if(num < 10){
            System.out.println("The square is : " + num * num);
        }else {
            System.out.println(num + " Number is Greater than 10");
        }

    }
}
