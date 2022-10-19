package July_22_2022;

public class TwoDArray {
    public static void main(String[] args) {
        int a[][] = {{1,2,3},{4,5,6},{7,8,9}};

        int rowSize = a.length;
        int colSize = a[0].length;

        for(int i = 0; i<rowSize; i++){

            for(int j = 0; j<colSize; j++){
                System.out.print(a[i][j] + " ");
            }

            System.out.println();
        }
    }
}
