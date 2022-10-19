 package July_11_2022;

public class Palidrom_Array {
    public static void main(String[] args) {
        int a[] = { 1, 2, 3, 4, 3, 2, 1 };

        int i = 0;
        int j = a.length - 1;

        boolean isPalidrom = true;

        while(i<j){
            if(a[i] == a[j]){
                i++;
                j--;
            }else{
                isPalidrom = false;
                break;
            }
        }
        System.out.println(isPalidrom);
    }
}
