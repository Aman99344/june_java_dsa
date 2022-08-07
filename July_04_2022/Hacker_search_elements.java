package July_04_2022;

import java.util.Scanner;

public class Hacker_search_elements {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int a[] = new int[n];

        for (int i = 0; i < a.length; i++) {
            a[i] = sc.nextInt();
        }
        System.out.println("Search element");
        int findNum = sc.nextInt();
            boolean found = false;
        for (int i = 0; i < a.length; i++) {
            if (a[i] == findNum) {
                found = true;
                System.out.println(i);
            }
        }

        if(found == false){
            System.out.println("-1");
        }

    }
}
