package July_15_2022;

import java.util.Arrays;

public class PracticeZero_ToRight {
    public static void main(String[] args) {
        int a[] = {4,5,0,5,3,0,5,7,0,9};

        int b [] = new int[a.length];

        int j = 0;

        for(int i = 0; i<a.length; i++){
            if(a[i] != 0){
                b[j] = a[i];

                j++;
            }
        }

        a = b;

        System.out.println(Arrays.toString(a));

    }
}
