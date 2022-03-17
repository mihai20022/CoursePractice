package Homework7Martie.PrintDatesTImes.PrintDate.PrintHour;

import java.util.Scanner;

public class PrintHour {
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
        System.out.println("Enter hours");
        hours = input.nextInt();
        System.out.println("Enter minutes");
        minutes = input.nextInt();
        System.out.println("Enter seconds");
        seconds = input.nextInt();


    }
// 100:100:100
    public void verifyDates(){
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

    //HH:mm:ss,


    public void PrintHour1(){
        System.out.println(finalHours + ":" + finalMinutes + ":" + finalSeconds);
    }





}
