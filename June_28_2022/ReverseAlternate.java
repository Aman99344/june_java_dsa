package June_28_2022;

public class ReverseAlternate {
    public static void main(String[] args) {
        
        int a[] = {1,5,8,4,2};

        for(int i = a.length-1; i>=0; i=i-2){
            System.out.println(a[i]);
        }
        
    }
}
