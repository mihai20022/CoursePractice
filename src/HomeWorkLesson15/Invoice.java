package HomeWorkLesson15;

public class Invoice {
    private String deviceModel;
    private String productDescription;
    public int quantityOfProductsPurchased;
    public int quantityall;
    public double price;
    public double finalinvoice;

    public void verifyQuantity(){
        if (quantityOfProductsPurchased <= 0)
            quantityall = 0;
        else quantityall = quantityOfProductsPurchased;

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

    public Invoice(String deviceModel, String productDescription, int quantityOfProductsPurchased, double price) {
        this.deviceModel = deviceModel;
        this.productDescription = productDescription;
        this.quantityOfProductsPurchased = quantityOfProductsPurchased;
        this.price = price;
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
        if (quantityall > 0) {
            finalinvoice = quantityall * price;
            System.out.println(finalinvoice);
        } else System.out.println("You didn't select any items");
    }

}




