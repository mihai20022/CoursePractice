package ExerciseProject.Main;

import ExerciseProject.Products.Category;
import ExerciseProject.Products.Products;
import ExerciseProject.Stock.Stock;

public class Main {
    public static void main(String[] args) {
        Products[] availableProducts;
        Stock[]  productsInStock ;
        Products product1 = new Products(1, "Milk", Category.Food, "Alba", 9.5);
        Products product2 = new Products(2, "Citroman", Category.Medicine, "Moldova Medocine", 50.4);
        Products product3 = new Products(3, "Watch", Category.Electronics, "Darwin", 104.31);

        availableProducts = new Products[]{product1, product2, product3};


        Stock stock1Product1 = new Stock(1, 1, 150, "Level 1", "11.12.2002");
        Stock stock2Product1 = new Stock(2, 1, 78,"Level 1", "11.04.2021");
        Stock stock1Product2 = new Stock(3, 2, 20,"Level 2", "11.04.2019");
        Stock stock1Product3 = new Stock(4, 3, 5,"Level 3", "11.04.2015");
        productsInStock = new Stock[]{ stock1Product1, stock1Product2, stock1Product3, stock2Product1};



        for (Products products:availableProducts){
            System.out.println(products.toString());
        }
        for (Stock stock:productsInStock){
            System.out.println(stock.toString());
        }




    }
}
