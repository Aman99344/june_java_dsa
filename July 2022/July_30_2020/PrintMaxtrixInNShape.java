package July_30_2020;

public class PrintMaxtrixInNShape {
    public static void main(String[] args) {
        
        int a[][] = {{1,2,3,1},{4,5,6,4},{7,8,9,4},{10,11,12,9}};

        int row = a.length;
        int col = a[0].length;

        

        for(int i = 0; i<row; i++){
            for(int j = 0; j<col; j++){
                if(j == 0 || j == col-1 || i == j){
                   
                    System.out.print(a[i][j] + " ");
                    
                    
                }else{
                    System.out.print("  ");
                }
               
            }
            System.out.println();
        }

        
    
    }
}
