package ArrayList.example10;

import java.util.ArrayList;
import java.util.Collections;

public class ShuffleArrayList {
    public static void main(String[] args) {
        ArrayList<String> names = new ArrayList<>();
        names.add("Alice");
        names.add("Bob");
        names.add("Charlie");
        names.add("David");

        System.out.println("Original ArrayList: " + names);

        Collections.shuffle(names);

        System.out.println("ArrayList after shuffling: " + names);
    }
}
