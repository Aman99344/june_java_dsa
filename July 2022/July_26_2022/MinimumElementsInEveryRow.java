package July_26_2022;

public class MinimumElementsInEveryRow {
    public static void main(String[] args) {
        int a[][] = {{2,1,3},{6,2,5},{8,9,4}};

        int row = a.length;
        int col = a[0].length;

        for(int i = 0; i<row; i++){

            int min = a[i][0];

            for(int j=0; j<col; j++){

                if(a[i][j] < min){

                    min = a[i][j];
                }

            }

            System.out.println(min);
        }
    }
}
