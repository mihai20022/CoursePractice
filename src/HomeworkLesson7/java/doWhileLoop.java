package HomeworkLesson7.java;

import java.util.Scanner;

public class doWhileLoop {
    public static void main(String[] args) {
        Scanner input;
        do {
            System.out.println("Enter 2 numbers");
            input = new Scanner(System.in);
            int number1 = input.nextInt();
            int number2 = input.nextInt();
            int sum = number1 + number2;
            System.out.println("Sum of the numbers\n" + sum);
            System.out.println("You want to perform the operation again.Type: \n 1.stop for stop \n 2.Continue for continue");
            String stop1 = input.next();

            if (stop1.equals("1")) {
                break;

            } else
                System.out.println("You want to try again. Enter 2 numbers again");
            continue;

        } while (true);

    }
}
