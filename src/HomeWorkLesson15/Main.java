package HomeWorkLesson15;

public class Main {
    public static void main(String[] args) {
        Invoice client1 = new Invoice("Iphone 12", "12GHz", -3  , 194);
        client1.verifyQuantity();
        client1.GetAmount();
    }
}
