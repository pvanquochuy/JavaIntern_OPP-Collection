package ArrayList.example4;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args){
        ArrayList<String> colors = new ArrayList<>();
        colors.add("Red");
        colors.add("Green");
        colors.add("Blue");
        colors.add("Yellow");

        int index = 2;
        String element = colors.get(index);

        System.out.println("Element at index " + index + ": " + element);
    }
}
