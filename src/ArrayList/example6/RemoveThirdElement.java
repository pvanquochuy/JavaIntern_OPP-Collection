package ArrayList.example6;
import java.util.ArrayList;
public class RemoveThirdElement {
    public static void main(String[] args) {
        ArrayList<String> colors = new ArrayList<>();
        colors.add("Red");
        colors.add("Green");
        colors.add("Blue");
        colors.add("Yellow");
        colors.add("Orange");

        System.out.println("Original ArrayList: " + colors);

        int indexToRemove = 2;
        String removedElement = colors.remove(indexToRemove);

        System.out.println("Removed element: " + removedElement);
        System.out.println("ArrayList after removal: " + colors);
    }
}
