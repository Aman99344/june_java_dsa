package July_15_2022;

import java.util.Arrays;

public class ReverseArrayisTempArray {
    public static void main(String[] args) {
        int a[]= {4,3,9,8,7};
        int b[] = new int[a.length];

        int j = 0;

       for(int i = a.length-1; i>=0; i--){

        b[j] = a[i];
        j++;
       }
       a = b;
       System.out.println(Arrays.toString(a));
    }
}

