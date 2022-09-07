package July_14_2022;

public class ElementsRepeatingOncePractice {
     public static void main(String[] args) {
         
        int a[]= {7,5,4,3,5,3,4};

        int xor = 0;

        for(int i = 0; i<a.length; i++){
            xor = xor ^ a[i];
        }
        System.out.println(xor);
     }
}
