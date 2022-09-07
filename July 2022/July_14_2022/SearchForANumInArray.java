package July_14_2022;

public class SearchForANumInArray {
    public static void main(String[] args) {
        
        int a[] = {13,5,1,43,7,8,10};

        int target = 3;

        boolean found = false;

        for(int i = 0; i<a.length; i++){

            if(a[i] == target){
                found = true;
                break;
            }
        }

        System.out.println(found);
    }
}
