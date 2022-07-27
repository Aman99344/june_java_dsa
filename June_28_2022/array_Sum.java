package June_28_2022;

public class array_Sum {
    public static void main(String[] args) {
        
        int a[] = {1,5,8,4,2};
        int sum = 0;

        for(int i = 0; i<a.length; i++){
            sum = sum + a[i];
        }
        System.out.println(sum);
    }
}
