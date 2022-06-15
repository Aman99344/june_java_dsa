package java_practice;
import java.util.Scanner;

public class Vowels {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();

        char ch = s.charAt(0);

        if((ch >=65 && ch<=99) || (ch >= 97 && ch <= 122)){

            if(ch == 'a' ||  ch == 'e' || ch == 'i' || ch == 'o'
           || ch == 'u' ||
           ch == 'A' ||  ch == 'E' || ch == 'I' || ch == 'O'
           || ch == 'U' )
           {
            System.out.println("It is vowel");
           }else {
            System.out.println("It is a consonent");
           }

        }else {
            System.out.println("Invalid Input");
        }

        
    }
}
