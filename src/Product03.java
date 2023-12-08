public class Product03 extends Products{
    String brand;

    public Product03(String productName, int price, String brand) {
        super(productName, price);
        this.brand = brand;
    }

    public String getBrand() {
        return brand;
    }
}
