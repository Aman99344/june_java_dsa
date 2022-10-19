package July_27_2022;

public class BinaryMtrix {
    public static void main(String[] args) {
        int a[][] = {{1,0,0}, {0,1,0},{0,0,1}};
        int row = a.length;
        int col = a[0].length;

        
        boolean isIdentity = true;

        for(int i = 0; i<row; i++){
            for(int j = 0; j<col; j++){
                if(i == j){
                    if(a[i][j] != 1){
                        isIdentity = false;
                        break;
                    }
                }else{
                    if(a[i][j] != 0){
                        isIdentity = false;
                        break;
                    }
                }
            }
    }

    System.out.println(isIdentity);
}

}
