package June_21_2022;
import java.util.Scanner;
public class Do_While {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        int i = 1;
        do{
            System.out.println(i);
            i++;
        }while(i <= num);

        
        
    }
}
