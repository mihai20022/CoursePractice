package HomeworkLesson11;

import java.util.Scanner;

public class SavingsAccount {

    public static float annualInterestRate;
    Scanner input = new Scanner(System.in);
    int savingsBalance1;
    float annualInterest;
    float monthlyInterest;



    public void savingsBalance(){
        System.out.println("Enter the amount of the saver currently has on deposit");
         savingsBalance1 = input.nextInt();
        System.out.println("Enter the annual Interest Rate ");
        annualInterestRate = input.nextFloat();


        System.out.println("The client has " + savingsBalance1);
    }
    public void calculateMonthlyInterest(){
        annualInterest = savingsBalance1 * (1 + annualInterestRate/100);
        monthlyInterest = annualInterest - savingsBalance1;
        System.out.println(monthlyInterest);


    }
}


