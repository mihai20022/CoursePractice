package HomeWorkLesson10.java.Homework2;

public enum Weekday {
    Monday ,
    Tuesday ,
    Wednesday,
    Thursday,
    Friday,
    Saturday,
    Sunday;



    public boolean isWeekDay(){
         return (this != Saturday || this != Sunday);
    }

    public boolean isHoliday(){
        return (this == Saturday || this == Sunday);
    }

    


}

