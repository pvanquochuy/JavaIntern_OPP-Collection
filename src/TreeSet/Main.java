package TreeSet;
import java.util.TreeSet;

public class Main {
    public static void main(String[] args){
//        1. Write a Java program to create a tree set, add some colors (strings) and print out the tree set.
        TreeSet<String> colorsSet = new TreeSet<>();

        colorsSet.add("Red");
        colorsSet.add("Green");
        colorsSet.add("Blue");
        colorsSet.add("Yellow");
        colorsSet.add("Purple");

        System.out.println("TreeSet of colors:");
        System.out.println(colorsSet);
//        2. Write a Java program to iterate through all elements in a tree set.
        System.out.println("Iterating using for-each loop:");
        for (String element : colorsSet) {
            System.out.println(element);
        }
//        3. Write a Java program to add all the elements of a specified tree set to another tree set.
        TreeSet<String> treeSet2 = new TreeSet<>();
        treeSet2.addAll(colorsSet);
        System.out.println(treeSet2);
//        4. Write a Java program to create a reverse order view of the elements contained in a given tree set.
        TreeSet<String> reverseTreeSet = (TreeSet<String>) colorsSet.descendingSet();
        System.out.println("Reverse order view of elements in the TreeSet:");
        System.out.println(reverseTreeSet);
//        5. Write a Java program to get the first and last elements in a tree set.
        String firstElement = colorsSet.first();
        String lastElement = colorsSet.last();
        System.out.println("First element in the TreeSet: " + firstElement);
        System.out.println("Last element in the TreeSet: " + lastElement);
//        6. Write a Java program to clone a tree set list to another tree set.
        // Clone the TreeSet to another TreeSet using addAll() method
        TreeSet<String> clonedSet = new TreeSet<>();
        clonedSet.addAll(colorsSet);
        System.out.println("Cloned TreeSet: " + clonedSet);
//        10. Write a Java program to get the element in a tree set which is greater than or equal to the given element.
        String searchElement = "Green";
        String result = colorsSet.ceiling(searchElement);
        if (result != null) {
            System.out.println("Element in the TreeSet greater than or equal to " + searchElement + ": " + result);
        } else {
            System.out.println("No element in the TreeSet greater than or equal to " + searchElement);
        }
    }



}
