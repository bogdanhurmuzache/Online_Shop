public class Product05 extends Products{
    int discount;

    public Product05(String productName, int price, int discount) {
        super(productName, price);
    }

    public int getDiscount() {
        return discount;
    }
}
