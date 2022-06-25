package June_21_2022;

import java.util.Scanner;

public class Salary_Bonus {
public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.println("Enter your Salary: ");
    int salary = sc.nextInt();

    System.out.println("Enter your Year: ");
    int year = sc.nextInt();

    if(year >= 5){
        int bonus = (salary * 5) / 100;
        System.out.println("Your are eligible for Bonus of " + bonus);
    }else{
        System.out.println("You are not Eligible");
    }
}
    
}
