import com.sun.tools.javac.Main;

import java.util.ArrayList;
import java.util.List;

public class Online_Shop {
    public Order currentOrder = new Order(); // instanta a clasei Order
    public List<Order> orders = new ArrayList<>();


    public void addProductToCurrentOrder(Products product) {
        currentOrder.addProduct(product);
    }

    public void deleteProductFromCurrentOrder(int index) {
        currentOrder.deleteProduct(index);
    }

    public void seeAllProductsFromCurrentOrder(){ //incomplet?
        for(Order order : orders ){
            order.seeAllProducts(); //pentru fiecare obiect din lista am apelat metoda
        }
    }

    public void seeAllProductsFromCurrentOrder_UsingIncrementation(){
        for(int order = 0; order < orders.size(); order++){
            orders.get(order).seeAllProducts();


        }


    }

    public void addOrderToOrderList(Order addAnOrder) {
        orders.add(addAnOrder);
    }
}

