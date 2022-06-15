package java_practice;
import java.util.Scanner;

public class SquareNum {
    public static void main(String[] args) {
        Scanner sc =  new Scanner(System.in);
        System.out.println("Enter the number");

        int num = sc.nextInt();
        int squareOfNum = num * num;

        if((num % 3 == 0)  && (squareOfNum > 500)){
            System.out.println("Matched");
        }else{
            System.out.println("Not Matched");
        }
    }
}
