package ArrayList.example8;

import java.util.ArrayList;
import java.util.Collections;
public class SortArrayList {
    public static void main(String[] args) {
        ArrayList<String> names = new ArrayList<>();
        names.add("Huy");
        names.add("Hoang");
        names.add("Dat");
        names.add("Huyen");

        System.out.println("Original ArrayList: " + names);

        Collections.sort(names);

        System.out.println("ArrayList after sorting: " + names);
    }
}
