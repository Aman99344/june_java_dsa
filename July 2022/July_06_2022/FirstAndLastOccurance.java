package July_06_2022;

public class FirstAndLastOccurance {
    public static void main(String[] args) {

        int a[] = { 40, 70, 14, 3, 70, 40, 4, 10, };

        int target = 40;
        int first = -1;
        int last = -1;

        for (int i = 0; i < a.length; i++) {
            int ind = a.length - i - 1;

            if (a[i] == target && first == -1) {
                first = i;
            }
            if (a[ind] == target && last == -1) {
                last = ind;
            }
        }

        System.out.println(first);
        System.out.println(last);

    }
}
