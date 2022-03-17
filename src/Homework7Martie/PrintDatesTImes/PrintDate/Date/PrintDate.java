package Homework7Martie.PrintDatesTImes.PrintDate.Date;

import java.util.Scanner;

public class PrintDate {
    Scanner input = new Scanner(System.in);
    int year;
    int month;
    int day;
    int day1;
    int month1;


    public void ShowFormat(){
        System.out.println("Write Year: ");
        year = input.nextInt();
        System.out.println("Write Month: ");
        month = input.nextInt();
        System.out.println("Write Day: ");
        day = input.nextInt();


    }

    public void VerifyInputsDates(){
        if(month >= 0 && month < 12){
            month1 = month;
        }

        if(day >= 0 && day < 31){
            day1 = day;
        }

    }
    //yyyy-MM-dd
    public void PrintDateFull(){
        System.out.println("Date is:  " + year + "-" + month1 + "-" + day1);

    }




}
