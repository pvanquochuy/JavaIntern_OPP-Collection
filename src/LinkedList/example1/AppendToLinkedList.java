package LinkedList.example1;

import java.util.LinkedList;
import java.util.ListIterator;

public class AppendToLinkedList {
    public static void main(String[] args) {
        LinkedList<String> linkedList = new LinkedList<>();

        linkedList.add("blue");
        linkedList.add("red");
        linkedList.add("green");

        System.out.println("LinkedList before appending: " + linkedList);

        String newElement = "yellow";
//        1. Write a Java program to append the specified element to the end of a linked list.
        linkedList.add(newElement);
        System.out.println("LinkedList after appending: " + linkedList);

//        2. Write a Java program to iterate through all elements in a linked list.
        System.out.println("Iterating using for-each loop:");
        for (String element : linkedList) {
            System.out.println(element);
        }
//        3. Write a Java program to iterate through all elements in a linked list starting at the specified position.
        // Specified position to start iterating from
        int startPosition = 2;

        System.out.println("Iterating from position " + startPosition + ":");
        for (int i = startPosition; i < linkedList.size(); i++) {
            System.out.println(linkedList.get(i));
        }
//        4. Write a Java program to iterate a linked list in reverse order.
        // Create a ListIterator positioned at the end of the list
        ListIterator<String> listIterator = linkedList.listIterator(linkedList.size());
        System.out.println("Iterating in reverse order:");
        while (listIterator.hasPrevious()) {
            System.out.println(listIterator.previous());
        }

//        5. Write a Java program to insert the specified element at the specified position in the linked list.
        int position = 2;
        String newElement1 = "purple";
        linkedList.add(position, newElement1);

        // Display the LinkedList after insertion
        System.out.println("LinkedList after insertion: " + linkedList);

//        6. Write a Java program to insert elements into the linked list at the first and last positions.
        // Insert element at the first position
        linkedList.addFirst("FirstElement");
        // Insert element at the last position
        linkedList.addLast("LastElement");
//        7. Write a Java program to insert the specified element at the front of a linked list.
//         -> addfirst("FirstElement");
//        8. Write a Java program to insert the specified element at the end of a linked list.
//        9. Write a Java program to insert some elements at the specified position into a linked list.
        // Elements to be inserted and their positions
        String[] elementsToInsert = {"NewElement1", "NewElement2"};
        int[] positions = {1, 3}; // Positions are 1-based

        for (int i = 0; i < elementsToInsert.length; i++) {
            int position1 = positions[i] - 1;
            if (position1 >= 0 && position1 <= linkedList.size()) {
                linkedList.add(position1, elementsToInsert[i]);
            } else {
                System.out.println("Invalid position: " + positions[i]);
            }
        }
        System.out.println("LinkedList after insertion: " + linkedList);

//        10. Write a Java program to get the first and last occurrence of the specified elements in a linked list.
        // Element to find occurrences
        String elementToFind = "green";

        // Get the first occurrence of the specified element
        int firstOccurrence = linkedList.indexOf(elementToFind);

        // Get the last occurrence of the specified element
        int lastOccurrence = linkedList.lastIndexOf(elementToFind);

        System.out.println("First occurrence of \"" + elementToFind + "\" is at index: " + firstOccurrence);
        System.out.println("Last occurrence of \"" + elementToFind + "\" is at index: " + lastOccurrence);
    }
}
