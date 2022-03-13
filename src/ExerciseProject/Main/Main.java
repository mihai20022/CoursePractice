package ExerciseProject.Main;

import ExerciseProject.Products.Category;
import ExerciseProject.Products.Products;
import ExerciseProject.Stock.Stock;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);


        while (true) {
            int k;
            System.out.println("-----------------------------------------------------------------------------------------------");
            System.out.println("Stock management app. " +
                    "\nPlease enter the corresponding number of the action you want to run!");
            System.out.println(" 1. Visualise available products.");
            System.out.println(" 2. Add new product.");
            System.out.println(" 3. Edit an existing product.");
            System.out.println(" 4. Visualise available stock.");
            System.out.println(" 5. Visualise available stock for a product.");
            System.out.println(" 6. Add stock for a product.");
            System.out.println(" 7. Edit an existing stock.");
            System.out.println(" 8. Delete stock.");
            System.out.println(" 9. Check available stock.");
            System.out.println(" 10. Add an order.");
            System.out.println(" 11. Pick an order.");
            System.out.println(" 12. Pick all orders.");
            System.out.println(" 13. Print all orders.");
            System.out.println(" 0. Exit the MAIN menu!");
            System.out.println("-----------------------------------------------------------------------------------------------");
            k = input.nextInt();


        }



    }
}
