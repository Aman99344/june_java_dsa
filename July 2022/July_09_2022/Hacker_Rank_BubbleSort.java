package July_09_2022;
import java.util.Arrays;
import java.util.Scanner;
public class Hacker_Rank_BubbleSort {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n =  sc.nextInt();
        
        sc.nextLine();
        int a[] = new int[n];

        for(int i = 0; i<a.length; i++){
            a[i]=sc.nextInt();
        }
        
        for(int i = 0; i<a.length-1; i++){
            
            for(int j = 0; j<a.length-1-i; j++){
                if(a[j+1] < a[j]){
                    
                    int temp = a[j];
                    a[j] = a[j+1];
                    a[j+1] = temp;
                }
                
            }
        }

        for(int i = 0; i<a.length; i++){
            System.out.print(a[i] + " ");
        }
        
    }
}
