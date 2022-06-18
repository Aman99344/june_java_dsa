package June_18_2022;

public class Pattern6 {
    public static void main(String[] args) {

        for(int i = 1; i<=4; i++){
            for(int j = 4; j>=i; j--){
                System.out.print("B" + " ");
            }
            System.out.println();
        }
    }
}
