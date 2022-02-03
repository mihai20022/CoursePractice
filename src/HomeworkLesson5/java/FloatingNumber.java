package HomeworkLesson5.java;
import java.util.Scanner;
public class FloatingNumber {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a floating number");
        float number = input.nextFloat();

        if (number > 0 && number < 1)
            System.out.println("Positive and small");
        else if (number > 1_000_000)
            System.out.println("Positive and large");
        if (number == 0 )
            System.out.println("Zero");

        else if (number < 0 )
            System.out.println("Negative and small");
    }

}
