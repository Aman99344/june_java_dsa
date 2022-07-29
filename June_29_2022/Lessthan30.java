package June_29_2022;

public class Lessthan30 {
    public static void main(String[] args) {
        int a[] = { 12, 56, 8, 16, 45, 21, 10 };
        int b = 30;
        int count = 0;

        for (int i = 0; i < a.length; i++) {

            if (a[i] < b) {
                count++;

            }
        }
        System.out.println(count);
    }
}
