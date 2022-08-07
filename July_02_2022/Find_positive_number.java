package July_02_2022;

import java.util.Scanner;

public class Find_positive_number {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int a[] = new int[n];

        for(int i  = 0; i<a.length; i++){
            a[i]=sc.nextInt();
        }

        int positive = 0;

        for(int i = 0; i<a.length; i++){
            if(a[i] > 0){
                positive++;
            }
        }
        System.out.println(positive);
    }
}
