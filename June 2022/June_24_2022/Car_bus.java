package June_24_2022;

public class Car_bus {
    public static void main(String[] args) {
        carBus();
    }

    static void carBus() {

        

        for (int i = 1; i <= 100; i++) {
            System.out.println(i);

            if (i % 5 == 0 && i % 10 != 0) {
                System.out.println("CAR");

            }else if(i % 10 == 0){
                System.out.println("BUS");
            }

        }

    }




}
