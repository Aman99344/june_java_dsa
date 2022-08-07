package July_05_2022;

import java.util.Scanner;

public class FindFirstVowels {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        char ch[] = new char[n];
        sc.nextLine();
        for(int i = 0; i<ch.length; i++){
            String s = sc.nextLine();
            ch[i] = s.charAt(0);
        }
       

        int found = -1;
        for(int i = 0; i<ch.length; i++){
            if(ch[i] == 'a' || ch[i] == 'e' || ch[i] == 'i'
            || ch[i] == 'o' || ch[i] == 'u'){

                found = i;
                break;
            }
        }

        System.out.println(found);
    }
}








// char ch[] = {'h','k','i','l','p'};

//         int found = -1;
//         for(int i = 0; i<ch.length; i++){
//             if(ch[i] == 'a' || ch[i] == 'e' || ch[i] == 'i'
//             || ch[i] == 'o' || ch[i] == 'u'){

//                 found = i;
//                 break;
//             }
//         }

//         System.out.println(found);