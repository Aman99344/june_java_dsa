package July_27_2022;

public class SparshMatrix {
    public static void main(String[] args) {
        int a[][] = {{0,0,3,0,4},{0,0,5,7,0},{0,0,0,0,0},{0,2,6,0,0}};

        int row = a.length;
        int col = a[0].length;

        

        int count  = 0;

        for(int i = 0; i<row; i++){
            for(int j = 0; j<col; j++){ 
                if(a[i][j] == 0){
                    count++;
                }
            }
        }

        
        if(count > (row * col) /2){
            System.out.println("Sparsh Matrix");
        }else{
            System.out.println("Not a Sparsh Matrix");
        }
    
        
    }
}
