package June_20_2022;
import java.util.Scanner;

public class Practice_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        int num3 = sc.nextInt();

        if(num1>100 || num2>100 || num3>100){
            System.out.println("invalid");
            return;
        }

       
        int  marks = num1 + num2 + num3;
        float percentage = (marks*100)/300;

       

        System.out.println("total marks: " + marks);
        System.out.println("Percentage: " + percentage);

        
    }
}
