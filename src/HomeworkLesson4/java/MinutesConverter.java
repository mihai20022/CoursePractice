package HomeworkLesson4.java;
import java.util.Scanner;

public class MinutesConverter {
    public static void main(String[] args){

        Scanner input = new Scanner(System.in);
        System.out.println("Enter minutes: ");
           long min = input.nextLong();

        //long min = 19483;
        double days ;
        double years ;
              days = min / 1440f;
            years = min / 525600f;
            input.close();

            String days1 = String.format("Days = " + "%.2f", days);
            String years1 = String.format("Years = "+ "%.2f", years);
        System.out.println(days1);
        System.out.println(years1);

    }

}
