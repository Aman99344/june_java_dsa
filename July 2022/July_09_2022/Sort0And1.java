package July_09_2022;
import java.util.Arrays;

public class Sort0And1 {
    public static void main(String[] args) {
        int a[] = { 0, 1, 0, 0, 1, 0, 1, 1, 1, 0, 1 };

        int zeroCount = 0;

        for (int i = 0; i < a.length; i++) {
            if (a[i] == 0) {
                zeroCount++;
            }
        }

        for (int i = 0; i < a.length; i++) {
            if (i < zeroCount) {
                a[i] = 0;
            }else{
                a[i] = 1;
            }
        }
        System.out.println(Arrays.toString(a));
    }
}
 