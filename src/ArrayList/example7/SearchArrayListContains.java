package ArrayList.example7;

import java.util.ArrayList;

public class SearchArrayListContains  {
    public static void main(String[] args) {
        ArrayList<String> colors = new ArrayList<>();
        colors.add("Red");
        colors.add("Green");
        colors.add("Blue");
        colors.add("Yellow");

        String elementToSearch = "Green";

        if (colors.contains(elementToSearch)) {
            System.out.println("Element found: " + elementToSearch);
        } else {
            System.out.println("Element not found: " + elementToSearch);
        }
    }
}
