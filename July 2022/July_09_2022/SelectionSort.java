package July_09_2022;
import java.util.Arrays;

public class SelectionSort {
    public static void main(String[] args) {

        int a[] = { 12, 17, 10, 13, 16 };

        for (int i = 0; i < a.length - 1; i++) {
             
            int minIndex = i;

            for(int j = i+1; j<a.length; j++){
                if(a[j]<a[minIndex]){
                    minIndex = j;
                }
            }

            int temp = a[i];
            a[i] = a[minIndex];
            a[minIndex] = temp;
        }

            // for(int k = 0; k<a.length; k++){
            //     System.out.print(a[k] + " ");
            // }

            System.out.println(Arrays.toString(a));
    }
}
