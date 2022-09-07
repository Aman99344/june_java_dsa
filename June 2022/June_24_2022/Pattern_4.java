package June_24_2022;

public class Pattern_4 {
    public static void main(String[] args) {
        int count = 0;


        for(int i = 0; i<=3; i++){
            count++;
            int x = count;
            for(int j = 1; j<=3; j++){
                System.out.print(x + " ");
                x = x + 3;

            }
            System.out.println();
        }

    }

}
