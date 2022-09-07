package July_14_2022;

public class HackerRankPrakElements {
    public static void main(String[] args) {
        
        int a[] = {4, 5, 3, 8, 6, 1,2,1};

        for(int i = 1; i<a.length-1; i++){
            if(a[i-1] < a[i] && a[i] > a[i+1]){
                System.out.println(a[i]);
            }
        }
    }
}
