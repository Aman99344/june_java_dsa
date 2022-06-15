package java_practice;
import java.util.Scanner;

public class CubeOfNum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Number");
        int num = sc.nextInt();

        int CubeOfNum = num * num * num;

        System.out.println("Cube of num is : " + CubeOfNum);

    }
}
  