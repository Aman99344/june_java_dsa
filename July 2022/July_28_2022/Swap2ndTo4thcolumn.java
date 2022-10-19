package July_28_2022;

public class Swap2ndTo4thcolumn {
    public static void main(String[] args) {
        int a[][] = {{1,5,9,13},{2,6,10,14},{3,7,11,15},{4,8,12,16}};

        int row = a.length;
        int col = a[0].length;

        int c1 = 1;
        int c2 = 3;

        for(int j = 0; j<col; j++){
            int temp = a[j][c1];
            a[j][c1] = a[j][c2];
            a[j][c2] = temp;
        }

      for(int i = 0; i<row; i++){
           for(int j = 0; j<col; j++){
            System.out.print(a[i][j] + "  ");
           }
           System.out.println();
      }    
    }
}
