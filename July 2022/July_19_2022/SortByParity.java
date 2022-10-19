package July_19_2022;

import java.util.Arrays;

public class SortByParity {
    public static void main(String[] args) {
        
        int a[] = {3,2,7,6,1,11,1,2,4,5,8,9,6};

        int i = 0;
        int j = a.length-1;

        while(i<j){

            if(a[i] % 2 == 0){
                i++;
            }

            if(a[j] % 2 != 0){
                j--;
            }

            if(a[i] % 2 != 0 && a[j] % 2 == 0 && i<j){

                int temp = a[i];
                a[i] = a[j];
                a[j] = temp;

            }

            i++;
            j--;
        }

        System.out.println(Arrays.toString(a));
    }
}
