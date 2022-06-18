package June_18_2022;

public class Patter4_Char {
    public static void main(String[] args) {
        for(char c = 'A'; c<='D'; c++){

            for(char ch = 'A'; ch<=c; ch++){
                System.out.print(ch);
            }
            System.out.println();
        }
    }
}
