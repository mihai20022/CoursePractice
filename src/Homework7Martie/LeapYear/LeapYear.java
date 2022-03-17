package Homework7Martie.LeapYear;

import java.util.Scanner;

public class LeapYear {

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



        public void LeapYear(){
            if(year%4 == 0){

                if(year%100 == 0){

                    if(year%400 == 0) {
                        System.out.println("Is a leap year");
                    }
                    else System.out.println("Is not a leap year");

                }
                else System.out.println("Is not a leap year");

            }
            else System.out.println("Is not a leap year");




        }
        public void PrintDateFull(){
            System.out.println("Date is:  " + year + "-" + month1 + "-" + day1);


        }




    }



