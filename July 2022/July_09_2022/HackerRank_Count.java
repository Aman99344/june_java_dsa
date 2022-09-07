package July_09_2022;

import java.util.Scanner;

public class HackerRank_Count {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        int count = 0;

        while(num > 0){
            num = num /10;
            count++;

        }
        System.out.println(count);
    }
}
