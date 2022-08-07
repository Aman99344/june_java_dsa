package July_04_2022;
import java.util.Scanner;
public class FindNum_Count {
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        char a[] = new char[n];

        sc.nextLine();
        
        for(int i = 0; i<a.length; i++){
            String s =  sc.nextLine();
            a[i] = s.charAt(0);
        }
            int count = 0;
        for(int i =0; i<a.length; i++){
            if(a[i]>='0' && a[i]<='9'){
                count++;
            }
        }
        System.out.println(count);
    }
}

























// char ch[] = {'7','v','m','O','9','p','N','r','1','0'};
//         int count = 0;
//         for(int i = 0; i<ch.length; i++){
//             if(ch[i]>='0' && ch[i]<='9'){
//                 count++;
//             }
//         }
//         System.out.println(count);