import java.util.ArrayList;
import java.util.List;

public class Order {
    //Online_Shop online_shop = new Online_Shop();
    List<Products> products = new ArrayList<>();

    public void addProduct(Products objects) {
        //this.products.add(products);
        products.add(objects);
    }

    public void deleteProduct(int index) {
        if (index >= 0 && index < products.size()) {
            products.remove(index);
        }
    }

    public void seeAllProducts() {
        for (Products object : products) {
            System.out.println(object.getProductName());
        }
    }


}

// order care sa aiba minim un produs din fiecare