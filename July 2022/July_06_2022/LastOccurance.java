package July_06_2022;

public class LastOccurance {
    public static void main(String[] args) {
        int a[] = { 10, 3, 5, 10, 4, 7, 10 };

        int target = 10;
        int found = -1;
        for (int i = a.length-1; i>=0; i--) {
            if (a[i] == target) {
                found = i;
               
                break;
            }
        }
        System.out.println(found);
    }
}
