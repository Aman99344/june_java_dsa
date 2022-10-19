package July_19_2022;

public class MountainArray {
    public static void main(String[] args) {
        int a[] = { 1, 2, 5, 2, 1 };

        int j = 0;

        boolean isMountain = true;

        while(j<a.length-1 && a[j] < a[j+1]){
            j++;
        }
            if(j==0 || j==a.length-1){
                isMountain = false;
            }

            while(j<a.length-1 && a[j] > a[j+1]){
                j++;
            }

            if(j != a.length-1){
                isMountain = false;
            }
            System.out.println(isMountain);
    }
}
