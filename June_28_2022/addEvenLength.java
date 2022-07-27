package June_28_2022;

public class addEvenLength {
    public static void main(String[] args) {

        int a[] = { 1, 8, 9, 7, 5, 7, 45, 56 };

        int lengthOfArray = a.length;
        boolean isEven = false;

        if (lengthOfArray % 2 == 0) {
            isEven = true;
        }

        System.out.println(isEven);
    }

}
