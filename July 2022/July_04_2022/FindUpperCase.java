package July_04_2022;



public class FindUpperCase {
    public static void main(String[] args) {

       char ch[] = {'A', 'k','M','p','B','L','V'};
        int count = 0;
       for(int i = 0; i<ch.length; i++){
            if(ch[i]>='A' && ch[i] <= 'Z'){
                count++;
            }
       }

       System.out.println(count);
       

       

       
    }
}
