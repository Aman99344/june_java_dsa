package July_18_2022;

public class Mising_Number_In_Array {
    public static void main(String[] args) {
        
        int a [] = {6,3,2,5,1};
        int n = 6;

        // int sumOfAll = 0;
       
        //  for(int i =1; i<=n; i++){
        //     sumOfAll = sumOfAll + i;
        //  }

        int sumOfAll = n*(n+1)/2;

         int sumOfArrays = 0;

         for(int i = 0; i<a.length; i++){
            sumOfArrays = sumOfArrays + a[i];
         }

         int diff = sumOfAll - sumOfArrays;

         System.out.println(diff);
    }
}
