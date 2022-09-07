package June_24_2022;
import java.util.Scanner;
public class Practice_Armstrong {
    public static void main(String[] args) {
        
        
        for(int i = 1; i<=1000; i++){ 
            int num = i; 
            int temp = i;
 
            int sum = 0;
            
            while(num > 0){
                int digit = num %10;
                int cube = digit * digit * digit;
                 sum = sum + cube;
                num = num / 10;

            }

            if(temp == sum){
                System.out.println(temp);
            }
        }


    }
    
}
