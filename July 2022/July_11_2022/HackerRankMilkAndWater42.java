package July_11_2022;

import java.util.Arrays;

import java.util.Scanner;

public class HackerRankMilkAndWater42 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int a[] = new int[n];

        for(int i = 0; i<a.length; i++){
            a[i] = sc.nextInt();
        }

        int i = 0;
        int j = a.length-1;

        while(i<j){
            if(a[i] < 0){
                i++;
            }

            if(a[j] > 0){
                j--;
            }

            if(a[i] > 0 && a[j] < 0){

                int temp = a[i];
                a[i] = a[j];
                a[j] = temp;

                i++;
                j--;
            }

        }

        for(int k = 0; k<a.length; k++){
            System.out.print(a[k] + " ");
        }



    }
}
