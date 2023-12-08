public class Product01 extends Products{
    String size;

    public Product01(String productName, int price, String size) {
        super(productName, price);
        this.size = size;
    }

    public String getSize() {
        return size;
    }
}