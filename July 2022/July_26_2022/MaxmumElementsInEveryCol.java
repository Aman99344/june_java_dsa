package July_26_2022;

public class MaxmumElementsInEveryCol {
    public static void main(String[] args) {
        int a[][] = {{2,1,3},{6,2,5},{8,9,4}};


        int row = a.length;
        int col = a[0].length;

        for(int j = 0; j<col; j++){

            int max= a[0][j];

            for(int i = 0; i<row; i++){

                if(a[i][j] > max){
                    max = a[i][j];
                }

            }

            System.out.println(max);
        }
    }
}
