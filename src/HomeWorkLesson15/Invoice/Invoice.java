package HomeWorkLesson15.Invoice;

import ExerciseProject.Products.Products;

import java.util.Scanner;

public class Invoice {
    private String deviceModel;
    private String productDescription;
    public int quantityOfProductsPurchased;
    public int quantityall;
    public double price;
    public double priceall;
    public double finalinvoice;
    Scanner input = new Scanner(System.in);

    public void ShowingInvoice(){
        System.out.println("Enter device Model: ");
        deviceModel = input.nextLine();
        System.out.println("Enter Product Description: ");
        productDescription = input.nextLine();
        System.out.println("Enter device QuantityOfProducts: ");
        quantityOfProductsPurchased = input.nextInt();
        System.out.println("Enter device Price: ");
        price = input.nextInt();


    }


    public void verifyQuantity(){
        if (quantityOfProductsPurchased <= 0)
            quantityall = 0;
        else quantityall = quantityOfProductsPurchased;

    }
    public void VerifyPrice(){
        if (price <= 0)
            price = 0;
        else priceall = price;
    }



    public String getDeviceModel() {
        return deviceModel;
    }

    public void setDeviceModel(String deviceModel) {
        this.deviceModel = deviceModel;
    }

    public String getProductDescription() {
        return productDescription;
    }

    public void setProductDescription(String productDescription) {
        this.productDescription = productDescription;
    }

    public int getQuantityOfProductsPurchased() {
        return quantityOfProductsPurchased;
    }

    public void setQuantityOfProductsPurchased(int quantityOfProductsPurchased) {
        this.quantityOfProductsPurchased = quantityOfProductsPurchased;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    /*public Invoice(String deviceModel, String productDescription, int quantityOfProductsPurchased, double price) {
        this.deviceModel = deviceModel;
        this.productDescription = productDescription;
        this.quantityOfProductsPurchased = quantityOfProductsPurchased;
        this.price = price;
    }*/

    public void Invoice1(){
        System.out.println("Device Model:" + deviceModel);
        System.out.println("Product Description:" + productDescription);
        System.out.println("Quantity:" + quantityOfProductsPurchased);
        System.out.println("Price:" + price);

    }

    @Override
    public String toString() {
        return "Invoice{" +
                "deviceModel='" + deviceModel + '\'' +
                ", productDescription='" + productDescription + '\'' +
                ", quantityOfProductsPurchased=" + quantityOfProductsPurchased +
                ", price=" + price +
                '}';
    }

    public void GetAmount(){
        if (quantityall > 0 && priceall > 0) {
            finalinvoice = quantityall * price;
            System.out.println("Final Invoice Price is - " + finalinvoice);
        } else System.out.println("ERROR 404. Please check the price and quantity");
    }

}




