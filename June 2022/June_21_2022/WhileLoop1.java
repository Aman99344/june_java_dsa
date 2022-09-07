package June_21_2022;
import java.util.Scanner;
public class WhileLoop1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        int counter = 0;

        while(num > 0){
         counter ++;
         num = num /10;
          

        }
        System.out.println(counter);

        
    }
}


// int i  = 1;

//         while(i<=num){
//             System.out.println(i);
//             i++;
//         }