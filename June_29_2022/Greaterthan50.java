package June_29_2022;

public class Greaterthan50 {
    public static void main(String[] args) {
        
        int a[] = {10,85,23,56,89,75,2};
        int count = 0;

        for(int i = 0; i<a.length; i++){
            if(a[i] > 50){
                count++;
            }
        }
        System.out.println(count);
    }
}
