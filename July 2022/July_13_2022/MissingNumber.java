package July_13_2022;

public class MissingNumber {
    public static void main(String[] args) {

        int a[] = { 1, 5, 7, 4, 2, 3, 8,6};

        int n = a.length + 1;

        int TotalSum = n * (n + 1) / 2;

        System.out.println(TotalSum);

        int sum = 0;

        // for(int i = 0; i<a.length; i++){
        //     sum = sum + a[i];
        // }

        int i = 0;
        int j = a.length-1;

        while(i<j){
            if(i<j){
                sum = sum + a[i] + a[j];
                
            }
            else{
                sum = sum + a[i];
            }
            
            i++;
            j--;

            
        }

         
        System.out.println(sum);

        System.out.println(TotalSum - sum);
    }
}
