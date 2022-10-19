package July_26_2022;

public class SumOfEachRowElementsInMatrix {
    public static void main(String[] args) {

        int a[][] = {{1,2,3},{4,5,6},{7,8,9}};

        int row = a.length;
        int col = a[0].length;

        

        for(int i = 0; i<row; i++){
            int sum = 0;
            for(int j =0; j<col; j++){
               sum = sum + a[i][j];
            }
            System.out.println(sum);
        }

        


    }
}
