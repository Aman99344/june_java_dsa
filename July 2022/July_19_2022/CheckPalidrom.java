package July_19_2022;

public class CheckPalidrom {
    public static void main(String[] args) {
        int a[] = { 1, 4, 6, 8, 6, 4, 1 };

        int i = 0;
        int j = a.length - 1;

        boolean isPalidrome = true;

        while (i < j) {

            if (a[i] != a[j]) {

                isPalidrome = false;
                break;

            }

            i++;
            j--;

        }
        System.out.println(isPalidrome);

    }

}
