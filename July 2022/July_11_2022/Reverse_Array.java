package July_11_2022;
import java.util.Arrays;

public class Reverse_Array {
    public static void main(String[] args) {
        
        int a[] = {2,1,7,8,5};

        int b[] = new int[a.length];

        for(int i = 0; i<a.length; i++){
            b[i] = a[a.length-1-i];
        }

        a = b;

        System.out.println(Arrays.toString(b));
    }
}
