import java.util.ArrayList;
import java.util.Arrays;

public class W_Practice_Array_ArrayList {
    public void Main(String[] args) {
        //Create

        // Array has a fixed size
        //String[] friendsArray1 = new String[4]; //creare obiect; 4 elemente sa aiba Array-ul
        String[] friendsArray = {"Ion", "Vasile", "Dumitru", "Mihai"};

        // ArrayList has a dynamic size(se poate micsora sau poate creste)
       //ArrayList<String> friendArrayList1 = new ArrayList<>(); // <> -> se refera la <String>
        ArrayList<String> friendsArrayList = new ArrayList<>(Arrays.asList("Marius", "Cristi", "Daniel", "Ioana"));

        //Get elemet
        System.out.println(friendsArray[1]);
        System.out.println(friendsArrayList.get(1));

        //Get size
        System.out.println(friendsArray.length);
        System.out.println(friendsArrayList.size());

        // Add an element
        // ! avand un array cu un anumit numar de elemente, nu se poate adauga vreun alt element....
        friendsArrayList.add("Bogdan");
        System.out.println(friendsArrayList.get(4));

        //Set an elemet
        friendsArray[0] = "Gelu";
        System.out.println(friendsArray[0]);

        friendsArrayList.set(0, "Ghita");
        System.out.println(friendsArrayList);

        //Remove
        // ! nu se poate scoate un element dintr-un array
        friendsArrayList.remove("Mihai");
        System.out.println(friendsArrayList.get(1));
    }





    ArrayList<String> food = new ArrayList<>();

    //food.add("pizza");
    //food.add("hamburger");
    //food.add("hotdog");



}
