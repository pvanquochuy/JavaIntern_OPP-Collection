package ArrayList.example12;

import java.util.ArrayList;
import java.util.List;

public class ExtractSubList {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(10);
        numbers.add(20);
        numbers.add(30);
        numbers.add(40);
        numbers.add(50);

        System.out.println("Original ArrayList: " + numbers);

        int fromIndex = 1;
        int toIndex = 4;
        List<Integer> extractedSubList = numbers.subList(fromIndex, toIndex);

        System.out.println("Extracted sublist: " + extractedSubList);

        extractedSubList.set(1, 25);

        System.out.println("Original ArrayList after modification: " + numbers);

    }
}
