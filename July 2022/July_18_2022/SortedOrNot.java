package July_18_2022;

public class SortedOrNot {
    public static void main(String[] args) {
        int a[]= {1,3,7,2,15};

        boolean isSorted = true;

        for(int i = 0; i<a.length-1; i++){
            if(a[i] > a[i + 1]){
                isSorted = false;
                break;
            }
        }

         System.out.println(isSorted);
    }
}
