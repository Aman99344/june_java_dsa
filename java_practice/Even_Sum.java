package java_practice;
import java.util.Scanner;

public class Even_Sum {

    public static void main(String[] args) {
        
   

    Scanner sc = new Scanner(System.in);
    int num = sc.nextInt();

    int evenSum = 0;

    for(int i = 1; i <= num; i++){
        if(i % 2 == 0){
            evenSum = evenSum + i;
        }
        
    }

    System.out.println(evenSum);
}

}

// 2  4 6 8 10 
