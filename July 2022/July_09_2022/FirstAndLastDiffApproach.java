package July_09_2022;

import java.util.Scanner;

public class FirstAndLastDiffApproach {
    public static void main(String[] args) {

        // System.out.println("Enter the elements");

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int a[] = new int[n];

        for (int i = 0; i < a.length; i++) {
            a[i] = sc.nextInt();
        }
        // System.out.println("Enter the Target");

        int target = sc.nextInt();

        int first = -1;
        int last = -1;

        for(int i = 0; i<a.length; i++){
            int end = a.length - i - 1;

            if(a[i] == target && first == -1){
                first = i;
            }
            if(a[end] == target && last == -1 ){
                last = end;
            }
        }
        System.out.println(first);
        System.out.println(last);

    }
}
