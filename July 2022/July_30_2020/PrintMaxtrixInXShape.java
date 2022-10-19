package July_30_2020;

public class PrintMaxtrixInXShape {
    public static void main(String[] args) {
        int a[][] = {{1,2,3},{4,5,6},{7,8,9}};

        int row = a.length;
        int col = a[0].length;

        
        for(int i =0; i<row ;i++){
            for(int j = 0; j<col; j++){
                if(i== j || i+j == row - 1){
                    System.out.print(a[i][j]);
                }else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
        
    
    }
}
