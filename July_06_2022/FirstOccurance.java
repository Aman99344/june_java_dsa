package July_06_2022;

public class FirstOccurance {
    public static void main(String[] args) {
        int a[] = { 10, 3, 5, 10, 4, 7, 10 };

        int target = 14;
        int found = -1;
        for (int i = 0; i < a.length; i++) {
            if (a[i] == target) {
                found = i;
               
                break;
            }
        }
        System.out.println(found);
    }
}
