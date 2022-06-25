package June_21_2022;
import java.util.Scanner;
public class Sum_Of_Even {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        int i = 0;
        int Evensum = 0;

        while(i <= num){
        Evensum = Evensum + i;
        i = i + 2;
        

        }

        System.out.println(Evensum);


        // 2 4 6 8 10
    }
    
}
