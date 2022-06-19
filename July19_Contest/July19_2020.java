package July19_Contest;

import java.util.Scanner;

public class July19_2020 {
    public static void main(String[] args) {   
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        for(int i = 1; i<=num; ++i){

           if(i % 3 == 0 && i % 2 != 0){
            System.out.print(i + " ");
           }

        }
    }
}
