package July_26_2022;

public class ProductOfPrimaryDiognalElements {
    public static void main(String[] args) {
        int a[][] = {{1,5,3},{4,2,6},{7,8,3}};

        int row = a.length;
        int col = a[0].length;

        int product = 1;

        for(int i = 0; i<row; i++){
            for(int j =0; j<col; j++){
                if(i==j){
                   
                    product = product *a[i][j];
                }
            }
        }

        System.out.println(product);
    }
}
 