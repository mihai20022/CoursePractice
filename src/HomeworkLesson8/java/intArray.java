package HomeworkLesson8.java;
import java.util.Arrays;
import java.util.Scanner;
public class intArray {
    public static void main(String[] args) {
        int i, n;



        Scanner input = new Scanner(System.in);
       do  {


            System.out.println("Enter how many number you want to have");
            n = input.nextInt();
            int[] intArray = new int[10];
            System.out.print("Enter the elements of the array:");
            for (i = 0; i < n; i++) {
                intArray[i] = input.nextInt();
            }

            System.out.println("Array elements are:");
            for (i = 0; i < n; i++) {
                System.out.print(intArray[i]);
                System.out.print(", ");
            }
            System.out.println("\nYou want to add a new array?\n Press 1 for stop\n Press 2 to continue");
            String stop = input.next();
            if(stop.equals("1"))
                break;
            else System.out.println("You want to enter again the string");



        } while (true);
    }
}
