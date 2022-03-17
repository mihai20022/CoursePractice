package Homework7Martie.PrintDatesTImes.PrintDate.Date;
// yyyy-MM-dd,
//HH:mm:ss,
//yyyy-MM-dd HH:mm:ss format pattern for given date and time

public class main {
    public static void main(String[] args) {
        PrintDate printDate = new PrintDate();
        printDate.ShowFormat();
        printDate.VerifyInputsDates();
        printDate.PrintDateFull();
    }

}
