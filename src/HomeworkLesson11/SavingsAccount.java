package HomeworkLesson11;

import java.util.Scanner;

public class SavingsAccount {

    public static float annualInterestRate;
    Scanner input = new Scanner(System.in);
    int savingsBalance1;
    float annualInterest;
    float monthlyInterest;
    float currentmonthInterest;



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
        System.out.println("Monthly Interest - " + monthlyInterest);
        currentmonthInterest =savingsBalance1 + monthlyInterest;
        System.out.println("Current amount own in bank - " + currentmonthInterest);



    }
}


