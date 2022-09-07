package July_13_2022;

import java.util.Arrays;

public class SortByCaseTwo_Pointers {
    public static void main(String[] args) {
        
        char ch[] = {'a','l','Z','H','o','j','K'};

        int i = 0;
        int j = ch.length-1;

        while(i<j){
            if(ch[i] >= 65 && ch[i] <=90 ){
                i++;
            }

            if(ch[j] >= 97 && ch[j] <= 122){
                j--;
            }


            if(ch[i] >= 97 && ch[i] <= 122 && ch[j] >= 65 && ch[j] <=90 && i<j ){

                char temp = ch[i];
                ch[i] = ch[j];
                ch[j] = temp;

                i++;
                j--;
            }
        }

    
        System.out.println(Arrays.toString(ch));
    //    for(int k = 0; k<ch.length; k++){
    //     System.out.println(ch[k]);
    //    }

    }
}
