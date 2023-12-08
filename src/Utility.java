import java.time.Instant;
import java.time.LocalDate;

public class Utility {

    static LocalDate currentDate = LocalDate.now();
    static LocalDate deliveryDate = currentDate.plusDays(3);
            //.plusSeconds(3 * 24 * 60 * 60); -> pentru biblioteca de Instant

    //static int availabilityDate; // pentru a fi folosit atributul in alta clasa, fara extends

    public static LocalDate displayCurrentDate() {
        System.out.println(currentDate);
        return currentDate;
    }

    public static String availabilityDate() {
        return "23.10.2024";
    }

    public static LocalDate displayDeliveryDate() {
        System.out.println(deliveryDate);
        return deliveryDate;
    }

}
// sa imi dea un timestamp system UTC -> biblioteca INSTANT
// Sa fie String, biblioteca pe net