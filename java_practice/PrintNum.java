package java_practice;

import java.util.Scanner;;

public class PrintNum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        for(int i = 0; i < num; i++){
            System.out.println(i);
        }

    }
}
