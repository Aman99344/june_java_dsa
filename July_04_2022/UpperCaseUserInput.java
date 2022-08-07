package July_04_2022;

import java.util.Scanner;

public class UpperCaseUserInput {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        char ch[] = new char[n];

        sc.nextLine();

        for(int i = 0; i<ch.length; i++){
            String s = sc.nextLine();
            ch[i] = s.charAt(0);
        }

        int count = 0;

        for(int i = 0; i<ch.length; i++){
            if(ch[i]>= 'A' && ch[i]<='Z'){
                count++;
            }
        }
        System.out.println(count);
    }
}
