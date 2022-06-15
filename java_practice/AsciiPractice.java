package java_practice;
import java.util.Scanner;

public class AsciiPractice {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        String s = sc.next();

        char ch = s.charAt(0);

       

       if(ch >= 65 && ch <= 90){
    System.out.println("Upper case");
       }else if(ch >= 97 && ch<= 122){
        System.out.println("Lower case");
       }
    }
}
