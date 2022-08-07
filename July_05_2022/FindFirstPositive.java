package July_05_2022;

import java.util.Scanner;

public class FindFirstPositive {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int a[] = new int[n];

        for(int i = 0; i<a.length; i++){
            a[i] = sc.nextInt();
        }
            int index = -1;
        for(int i = 0; i<a.length; i++){
            if(a[i]>=0){
                index = i;
                break;
            }
        }

        System.out.println(index);

    }
}
