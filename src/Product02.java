public class Product02 extends Products{
    String color;

    public Product02(String productName, int price, String color) {
        super(productName, price);
        this.color = color;
    }

    public String getColor() {
        return color;
    }
}