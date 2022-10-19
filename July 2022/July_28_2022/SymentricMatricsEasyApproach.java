package July_28_2022;

public class SymentricMatricsEasyApproach {
    public static void main(String[] args) {
        int a[][] = { { 2, 3, 6 }, { 3, 4, 5 }, { 6, 5, 9 } };
        int row = a.length;
        int col = a[0].length;

        boolean flag = true;

        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                if (a[i][j] != a[j][i]) {
                    flag = false;
                    break;
                }
            }

        }

        System.out.println(flag);

    }
}
