public class Products {
    String productName;
    int price;
    String availabilityDate;

    //constructorul este folosit pentru a initializa variabilele clasei
    // si a face pregatirile necesare pentru utilizarea obiectului
    public Products(String productName, int price) {
        this.productName = productName;
        this.price = price;
        this.availabilityDate = Utility.availabilityDate();
    }


    public String getProductName() {
        return productName;
    }

    public int getPrice() {
        return price;
    }

    public String getAvailabilityDate() {
        return availabilityDate;
    }


}
