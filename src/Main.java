import static java.awt.Color.blue;

public class Main {
    public static void main(String[] args) {
        Online_Shop command = new Online_Shop();


        // clasa Online_Shop trebuie sa fie  capabila sa gestioneze multiple comenzi

        Product01 product_01 = new Product01("T-shirt", 50,"S"); //instanta a clasei Product01
        Product02 product_02 = new Product02("Jeans", 100, "blue");
        Product03 product_03 = new Product03("TV", 99, "Samsung");
        Product04 product_04 = new Product04("Shirt", 78, "Short");
        Product05 product_05 = new Product05("Skinny jeans", 181, 10);

        Order mainOrder_01 = new Order();
        mainOrder_01.addProduct(product_01);
        mainOrder_01.addProduct(product_02);
        mainOrder_01.addProduct(product_03);
        //mainOrder.seeAllProducts();
        mainOrder_01.addProduct(product_05);
        mainOrder_01.addProduct(product_04);
        //mainOrder.deleteProduct(1);
        mainOrder_01.seeAllProducts();
        System.out.println();

        Order mainOrder_02 = new Order();
        mainOrder_02.addProduct(product_04);
        mainOrder_02.addProduct(product_05);
        mainOrder_02.seeAllProducts();

        command.addOrderToOrderList(mainOrder_01);
        command.addOrderToOrderList(mainOrder_02);

        System.out.println();
        System.out.println("De aici se afiseaza din Online_SHop: ");
        command.seeAllProductsFromCurrentOrder();
        System.out.println();


        System.out.println("Current Date is: " + Utility.displayCurrentDate());
        System.out.println("Delivery Date is: " + Utility.displayDeliveryDate());


        //apelez metoda

// 2 ordere
// De adaugat in online-shop
// sa modific un produs direct din obiectul de online_shop, nu din Order.





        /*command.addProductToCurrentOrder(new Products("Shirt", 13));
        System.out.println();

        //command.seeAllProductsFromCurrentOrder();
        //System.out.println();

        command.deleteProductFromCurrentOrder(1);
        System.out.println();

        command.seeAllProductsFromCurrentOrder();
        System.out.println();*/




    }

}


// un obiect de tip Order care sa contina produsele pe care trebuie sa le creez

//int a = 10;

//instantiere: nu dau o valoare concreta; atribui obiectului rezultatul constructorului clasei
        //NumeClasa numeObiect = new NumeClasa


