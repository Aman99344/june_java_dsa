package July_09_2022;

public class Min_index {
    public static void main(String[] args) {
        
        int a[] = {10,1,4,2};

        int minindex = 0;

        for(int i= 1; i<a.length; i++){
            if(a[i]<a[minindex]){
                minindex = i;
            }
        }
        System.out.println(minindex);
    }
}
