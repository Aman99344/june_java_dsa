package July_09_2022;

public class Min_num_practiice {
    public static void main(String[] args) {
        int a[] = {10,1,4,2};

        int min = a[0];

        for(int i = 1; i<a.length; i++){
            if(a[i]<min){
                min = a[i];
            }
        }
        System.out.println(min);
    }
}
