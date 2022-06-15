package java_practice;
import java.util.Scanner;

public class TimeGretting {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int hour = sc.nextInt();

        if(hour < 12 ){
            System.out.println("good morning");

        }else if(hour >= 12 && hour <= 16){    
            System.out.println("good afternoon");

        }else if(hour > 16 && hour <= 20){
            System.out.println("good evening");

        }else if(hour > 20 && hour <= 24){
            System.out.println("good night");

        }else{
            System.out.println("invalid input");
        }
            

    }
}
// // Print "good morning" if the hour is less than 12,

// print "good afternoon" if the hour is greater than or equal to 12 or less than or equal to 16,

// print "good evening" if the hour is greater than 16 or less than or equal to 20

// and print "good night" if hour is greater than 20



// Note:- If the input is greater than 24, which is more than number of hours in a day, print invalid input.