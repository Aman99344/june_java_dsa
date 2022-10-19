package July_28_2022;

public class Swap2ndTo4thRow {
    public static void main(String[] args) {
        int a[][] = {{1,2,3},{4,5,6},{7,0,9},{3,0,7}};

        int row = a.length;
        int col = a[0].length;

        int r1 = 1;
        int r2 = 3;  

        for(int j = 0; j<col; j++){
            int temp = a[r1][j];
            a[r1][j] = a[r2][j];
            a[r2][j] = temp;

        }
        

       

        for(int i = 0; i<row; i++){
            for(int j = 0; j<col; j++){
                System.out.print(a[i][j] + " ");
            }
            System.out.println();
        }


    }
}
