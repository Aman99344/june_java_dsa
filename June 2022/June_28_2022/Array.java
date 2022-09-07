package June_28_2022;

public class Array {
    public static void main(String[] args) {
        
        int a [] = {1,10,58,96,8};
        System.out.println("Array length" + " " + a.length);
        
        for(int i = 0; i<a.length; i++){
            System.out.println(a[i]);
        }

        System.out.println("Printing reverse");

        for(int i = 4; i>=0; i--){
            System.out.println(a[i]);
        }
    }
}
