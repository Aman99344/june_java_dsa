package June_24_2022;

import java.util.Scanner;

public class Practice_4N {
    public static void main(String[] args) {

        compute();

    }

    static void compute(){
        int i = 1;
        int counter = 1;
            while(counter <= 3){
                if((4 * i + 9)%3==0){
                    System.out.println(i);
                    counter++;
                }
                i++;

            }
    }

}
