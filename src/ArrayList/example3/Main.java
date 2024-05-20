package ArrayList.example3;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args){
        ArrayList<String> fruits = new ArrayList<>();
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Orange");

        System.out.println("Original ArrayList: " + fruits);

        fruits.add(0, "Mango");

        System.out.println("ArrayList after insertion: " + fruits);
    }
}
