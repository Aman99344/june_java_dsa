package June_18_2022;

public class Pattern_8_Even {
    public static void main(String[] args) {
        int num = 2;
        
        for(int i = 1; i<=4; i++){
            for(int j = 1; j<= i;  j++){
                System.out.print(num + " ");
              num = num + 2;
            }
            System.out.println();
        }
    }
}

// int num=2;
//         for(int i=1;i<5;i++)
//         {
//              for(int j=1;j<=5-i;j++){
//              System.out.print(num+ " ");
//              num+=2;
//              }
            
//               System.out.println();
//         }
