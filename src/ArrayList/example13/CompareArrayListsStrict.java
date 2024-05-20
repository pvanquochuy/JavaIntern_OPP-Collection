package ArrayList.example13;
import java.util.ArrayList;

public class CompareArrayListsStrict {
    public static void main(String[] args) {
        ArrayList<String> list1 = new ArrayList<>();
        list1.add("Apple");
        list1.add("Banana");
        list1.add("Orange");

        ArrayList<String> list2 = new ArrayList<>();
        list2.add("Apple");
        list2.add("Banana");
        list2.add("Orange");

        boolean areEqual = list1.equals(list2);

        if (areEqual) {
            System.out.println("The ArrayLists are equal.");
        } else {
            System.out.println("The ArrayLists are not equal.");
        }
    }
}
