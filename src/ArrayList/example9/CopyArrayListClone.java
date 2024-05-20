package ArrayList.example9;

import java.util.ArrayList;

public class CopyArrayListClone {
    public static void main(String[] args) {
        ArrayList<String> fruits = new ArrayList<>();
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Orange");


        ArrayList<String> copiedList = (ArrayList<String>) fruits.clone();

        fruits.add("Mango");

        System.out.println("Original ArrayList: " + fruits);
        System.out.println("Copied ArrayList: " + copiedList);
    }
}
