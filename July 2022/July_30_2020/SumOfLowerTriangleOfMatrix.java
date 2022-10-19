package July_30_2020;

public class SumOfLowerTriangleOfMatrix {
    public static void main(String[] args) {
        int a[][] = {{1,2,3},{4,5,6},{7,8,2}};

        int row = a.length;
        int col = a[0].length;

        int sum = 0;

        for(int i = 0; i<row; i++){
            for(int j = 0; j<=i; j++){
                sum = sum + a[i][j];
            }
        }

        System.out.println(sum);
    
    }
}
