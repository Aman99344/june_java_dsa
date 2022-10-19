package July_18_2022;

import java.util.Arrays;

public class Bubble_sort {
    public static void main(String[] args) {
        
        int a [] = {9, 4, 3, 8, 7};

        for(int i = 0; i<a.length-1; i++){

            for(int j = 0; j<a.length-1-i; j++){
                if(a[j]>a[j+1]){

                    //swap
                    int temp = a[j];
                    a[j] = a[j +1];
                    a[j+1] = temp;

                }
            }
        }

        System.out.println(Arrays.toString(a));
    }
}
