public class Product04 extends Products{
    String shortOrLong;

    public Product04(String productName, int price, String shortOrLong) {
        super(productName, price);
        this.shortOrLong = shortOrLong;
    }

    public String getShortOrLong() {
        return shortOrLong;
    }

}
