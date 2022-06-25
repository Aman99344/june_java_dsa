package June_21_2022;
import java.util.Scanner;
public class Product_Of_Even {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int j = 2;
        int mul = 1;
        while(j <= num){
            mul = mul * j;
          j+=2;
        }
        System.out.println(mul);
    }
}
