package June_20_2022;
import java.util.Scanner;
public class Practice_3 {
    public static void main(String[] args) {
        for(int i = 1; i<=20; i++){
            if(i % 3 == 0){
              
                if(i % 2 == 0){
                    continue;
                }
                System.out.println(i);
            }
        }
    }    
}
