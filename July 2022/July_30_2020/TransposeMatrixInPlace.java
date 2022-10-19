package July_30_2020;

public class TransposeMatrixInPlace {
    public static void main(String[] args) {
        int a[][] = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };

        int row = a.length;
        int col = a[0].length;

        for (int i = 0; i < row; i++) {
            for (int j = i; j < col; j++) {

                int temp = a[i][j];
                a[i][j] = a[j][i];
                a[j][i] = temp;

            }
        }

        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                System.out.print(a[i][j] + " ");
            }
            System.out.println();
        }
    }
}
