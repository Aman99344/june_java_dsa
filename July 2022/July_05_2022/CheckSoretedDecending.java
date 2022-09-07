package July_05_2022;

import java.util.Scanner;

public class CheckSoretedDecending {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int a[] = new int[n];

        for(int i = 0; i<a.length; i++){
            a[i] = sc.nextInt();
        }
            boolean sorted = true;
        for(int i = 0; i<a.length-1; i++){
            if(a[i] < a[i+1]){
                sorted = false;
                break;
            }
        }

        if(sorted == true){
            System.out.println("Sorted");
        }else{
            System.out.println("Not Sorted");
        }

    }
}
