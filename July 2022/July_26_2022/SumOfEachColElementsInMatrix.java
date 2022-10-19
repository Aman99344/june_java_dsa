package July_26_2022;

public class SumOfEachColElementsInMatrix {
    public static void main(String[] args) {
        int a[][] = {{1,2,3},{4,5,6},{7,8,9}};

        int row = a.length;
        int col = a[0].length;


        for(int j = 0; j<row; j++){

            int sum = 0;

            for(int i = 0; i<col; i++){
                sum = sum + a[i][j];
            }

            System.out.println(sum);
        }

    }
}
