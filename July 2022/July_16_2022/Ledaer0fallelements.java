package July_16_2022;

public class Ledaer0fallelements {
    public static void main(String[] args) {
        int a[] = { 16, 17, 4, 3, 5, 2 };

        for (int i = 1; i < a.length; i++) {
            int leader = a[i];

            boolean isleader = true;

            for (int j = i + 1; j < a.length; j++) {
                if (a[j] < leader) {
                    continue;
                } else {
                    isleader = false;
                    break;
                }

            }

            if(isleader == true){
                System.out.println(leader);
            }

        }

    }

}
