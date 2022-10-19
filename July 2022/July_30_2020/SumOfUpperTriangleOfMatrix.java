package July_30_2020;

public class SumOfUpperTriangleOfMatrix {
    public static void main(String[] args) {
        int a[][] = {{1,2,3},{4,5,6},{7,8,9}};

        int row = a.length;
        int col = a[0].length;

        int sum = 0;

        for(int i = 0; i<row; i++){
            for(int j = i; j<col; j++){
                sum = sum + a[i][j];
            }
        }

        System.out.println(sum);
    
    }
}
