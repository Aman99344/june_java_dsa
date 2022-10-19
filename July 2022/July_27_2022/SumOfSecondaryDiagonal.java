package July_27_2022;

public class SumOfSecondaryDiagonal {
public static void main(String[] args) {
    int a[][] = {{1,2,3},{4,5,6},{7,8,9}};

    int row = a.length;
    int col = a[0].length;

    int sum = 0;

    for(int i = 0;  i<row; i++){
        for(int j = 0; j<col; j++){
            if((i + j) == row -1){
                sum = sum + a[i][j];
                break;
            }
        }
    }

    System.out.println(sum);
}
}
