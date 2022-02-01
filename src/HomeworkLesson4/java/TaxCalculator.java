package HomeworkLesson4.java;

public class TaxCalculator {
    public static void main(String[] args){
        double price = 10.04;
        double tax = 50.7;
        int quantity = 10;
        double total = quantity * (price + tax);
        System.out.println(total);
    }

}
