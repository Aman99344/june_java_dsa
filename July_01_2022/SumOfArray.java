package July_01_2022;

public class SumOfArray {
    public static void main(String[] args) {

        int a[] = new int[5];
        int sum = 0;

        a[0] = 10;
        a[1] = 20;
        a[2] = 30;
        a[3] = 40;
        a[4] = 50;

        for (int i = 0; i < a.length; i++) {
            sum = sum + a[i];
        }
        System.out.println(sum);
    }
}
