package July_26_2022;

public class ProductOfPrimaryDiognalElements2ndApproach {
    public static void main(String[] args) {

        int a[][] = {{2,1,3},{6,2,5},{8,9,4}};

        int row = a.length;
        int col = a[0].length;

        int product = 1;

        for(int i =0; i<row; i++){
           
            product = product * a[i][i];
        }

        System.out.println(product);

    }
}
