package July_07_2022;

public class FindDuplicateInArray {
    public static void main(String[] args) {
        int a[] = {3,4,5,7,9,9,16};
        
        int flag = 0;

        for(int i = 0; i<a.length-1; i++){
            if(a[i]==a[i+1]){
                flag = 1;
                break;
            }
        }

        if(flag == 1){
            System.out.println("Yes");
        }else{
            System.out.println("No");
        }
    }
}
