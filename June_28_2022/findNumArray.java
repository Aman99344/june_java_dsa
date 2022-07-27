package June_28_2022;

public class findNumArray {
    public static void main(String[] args) {
        
        int a [] = {10,15,17,3,9};

        int num = 33;
        boolean isPresent = false;

        for(int i = 0; i<a.length; i++){
            if(num == a[i]){
                isPresent = true;
                break;
            }
        }
            if(isPresent == true){
                System.out.println("Present");
            }else{
                System.out.println("Not Present");
            }
    }
}
