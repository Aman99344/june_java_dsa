package July_09_2022;

public class Minimum_NUmber_index {
    public static void main(String[] args) {
        
        int a [] = {10,2,4,1};

        int min = a[0];

        for(int i = 1; i<a.length; i++){
            if(a[i] < min){
                min = a[i];
            
            }
            
        }
        System.out.println(min);
        
    }
} 
