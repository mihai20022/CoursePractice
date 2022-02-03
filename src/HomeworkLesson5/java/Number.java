package HomeworkLesson5.java;
import java.util.Scanner;
public class Number {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number: ");
        long number = input.nextLong();

            if (number % 2 == 0) {
                System.out.println("It's an even number");
            } else if (number % 2 == 1) {
                System.out.println("It's a odd number");
            }
            input.close();

    }
}
