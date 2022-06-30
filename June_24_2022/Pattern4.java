package June_24_2022;

public class Pattern4 {
    public static void main(String[] args) {
        for (int i = 0; i <= 3; i++) {
            for (int j = 0; j <= 3; j++) {

                if (i == 0 || i == 2) {
                    System.out.print("#");
                } else if (i == 1 || i == 3) {
                    System.out.print("*");
                }
               
            }
            System.out.println(); 
        }
       
    }

}
