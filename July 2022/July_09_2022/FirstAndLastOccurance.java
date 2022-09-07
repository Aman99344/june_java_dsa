package July_09_2022;

import java.util.Scanner;

public class FirstAndLastOccurance {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int a[] = new int[n];

        for (int i = 0; i < a.length; i++) {
            a[i] = sc.nextInt();
        }

        int target = sc.nextInt();

        boolean isFound = false;
        boolean isFound2 = false;

        for (int i = 0; i < a.length; i++) {
            if (a[i] == target) {
                isFound = true;
                System.out.println(i);
                break;
            }
        }

        for(int i = a.length-1; i>=0; i--){
            if(a[i] == target){
                 isFound2 = true;
                System.out.println(i);
                break;
            }
        }

        if(isFound == false){
            System.out.println("-1");
        }

        if(isFound2 == false){
            System.out.println("-1");
        }

    }
}
