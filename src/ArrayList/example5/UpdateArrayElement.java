package ArrayList.example5;
import java.util.ArrayList;
public class UpdateArrayElement {
    public static void main(String[] args) {
        ArrayList<String> colors = new ArrayList<>();
        colors.add("Red");
        colors.add("Green");
        colors.add("Blue");
        colors.add("Yellow");

        int index = 2;
        String newElement = "Purple";

        colors.set(index, newElement);

        System.out.println("ArrayList after update: " + colors);
    }

}
