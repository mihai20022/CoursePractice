package Homework7Martie.PrintDatesTImes.PrintDate.PrintFull;

import java.util.Scanner;

public class PrintFull {
    int year;
    int month;
    int day;
    int day1;
    int month1;
    int hours;
    int finalHours;
    int minutes;
    int  finalMinutes;
    int hoursFromMinutes;
    int seconds;
    int minutesFromSeconds;
    int finalSeconds;
    Scanner input = new Scanner(System.in);


    public void GatherDates(){

        System.out.println("Write Year: ");
        year = input.nextInt();
        System.out.println("Write Month: ");
        month = input.nextInt();
        System.out.println("Write Day: ");
        day = input.nextInt();
        System.out.println("Enter hours");
        hours = input.nextInt();
        System.out.println("Enter minutes");
        minutes = input.nextInt();
        System.out.println("Enter seconds");
        seconds = input.nextInt();


    }


    public void VerifyInputsDates(){
        if(month >= 0 && month < 12){
            month1 = month;
        }

        if(day >= 0 && day < 31){
            day1 = day;
        }


        if (seconds > 60 ){
            minutesFromSeconds = seconds/60; //1
            finalMinutes = minutesFromSeconds + minutes; // 100+ 1
            finalSeconds = seconds%60;
            System.out.println(finalSeconds);

        }
        else finalSeconds =  seconds;

        if (finalMinutes > 60 ){
            hoursFromMinutes = finalMinutes/60;//1
            finalHours = hoursFromMinutes + hours;
            finalMinutes = finalMinutes%60;
            System.out.println(finalMinutes);
        }
        else finalMinutes = minutes;

    }

    public void PrintFull1(){
        System.out.println(year + "-" + month1 + "-" + day1 + " " + finalHours + ":" + finalMinutes + ":" + finalSeconds);

    }







}
