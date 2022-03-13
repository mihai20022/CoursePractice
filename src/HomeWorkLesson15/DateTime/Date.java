package HomeWorkLesson15.DateTime;

import java.util.Scanner;

public class Date {
    private int day;
     String month;
    private int year;
    Scanner input = new Scanner(System.in);

    public void GatherDate(){
        System.out.println("Enter day: ");
        day = input.nextInt();
        System.out.println("Enter Month: ");
        month = input.next();
        System.out.println("Enter Year: ");
        year = input.nextInt();

    }

    public void DisplayDate(){
        System.out.println("Day: " + day + "\nMonth: " + month + "\nYear: " + year );

    }



    public int getDay() {
        return day;
    }

    public void setDay(int day) {
        this.day = day;
    }

    public String getMonth() {
        return month;
    }

    public void setMonth(String month) {
        this.month = month;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    /*public Date(int day, String month, int year) {
        this.day = day;
        this.month = month;
        this.year = year;
    }*/

    @Override
    public String toString() {
        return "Date{" +
                "Day=" + day +
                ", Month='" + month + '\'' +
                ", Year=" + year +
                '}';
    }
}
