package July_28_2022;

import java.util.Arrays;

public class SymentricMatrix {
    public static void main(String[] args) {
        int a[][] = { { 2, 3, 6 }, { 3, 4, 5 }, { 6, 5, 9 } };

        int row = a.length;
        int col = a[0].length;

        int b[][] = new int[row][col];


        for(int j = 0; j<col; j++){
            for(int i = 0; i<row; i++){
                b[i][j] = a[i][j];
            }
             
            
        }

        boolean symentric = true;

        for(int j = 0; j<col; j++){
            for(int i = 0; i<row; i++){
               if(a[i][j] != b[j][i]){
                    symentric = false;
                    break;
               }
            }
           
            
        }

        
        System.out.println(symentric);


    }

}
