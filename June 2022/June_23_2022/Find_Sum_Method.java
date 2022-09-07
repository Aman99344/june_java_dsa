package June_23_2022;
import java.util.Scanner;
public class Find_Sum_Method {
    public static void main(String[] args) {
        
       int num =  readInput();
       int sum = findSum(num);

       System.out.println(sum);  
        
    } 


// Read the data.
      static int readInput(){
            Scanner sc = new Scanner(System.in);
            int n = sc.nextInt();
            return n;
        }
// Find sum
   static   int findSum(int a){
            int sum = 0;
            for(int i = 0; i<=a; i++){
                sum = sum + i;
              
            }
            
            return sum;
        }

    }

