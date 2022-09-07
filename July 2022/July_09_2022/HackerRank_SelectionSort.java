package July_09_2022;
import java.util.Scanner;

public class HackerRank_SelectionSort {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        int n = sc.nextInt();

        int a[] = new int [n];

        for(int i = 0; i<a.length; i++){
            a[i] = sc.nextInt();
        }


        for(int i = 0; i<a.length-1; i++){
            int minIndex = i;

            for(int j = i+1; j<a.length; j++){
                if(a[j] < a[minIndex]){
                    minIndex = j;
                }


            }

            int temp = a[i];
            a[i] = a[minIndex];
            a[minIndex] = temp;
        }

        for(int k = 0; k<a.length; k++){
            System.out.print(a[k]+ " ");
        }
    }
}
