package June_24_2022;

public class Practice7Term {
    public static void main(String[] args) {
        compute();
    }

    static void compute(){
        int n = 1;
        int count = 1;

        while(count <= 7){

            if((n * 6*n)%6==0){
                System.out.println(n);
                count++;
            }
           n++; 
        }

    
    }

}
