package HashSet;

import java.util.HashSet;
import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {
//        1. Write a Java program to append the specified element to the end of a hash set.

        HashSet<String> hashSet = new HashSet<>();

        hashSet.add("Element1");
        hashSet.add("Element2");
        hashSet.add("Element3");

        System.out.println("HashSet before appending: " + hashSet);

        String newElement = "NewElement";

        hashSet.add(newElement);

        System.out.println("HashSet after appending: " + hashSet);
//        2. Write a Java program to iterate through all elements in a hash list.
        System.out.println("Iterating using for-each loop:");
        for (String element : hashSet) {
            System.out.println(element);
        }
//        3. Write a Java program to get the number of elements in a hash set.
        int size = hashSet.size();
        System.out.println("Number of elements in the HashSet: " + size);
//        4. Write a Java program to empty an hash set.
//        hashSet.clear();
//        5. Write a Java program to test if a hash set is empty or not.
        hashSet.isEmpty();
//        6. Write a Java program to clone a hash set to another hash set.
        // Clone the HashSet to another HashSet using clone() method
        HashSet<String> clonedSet = (HashSet<String>) hashSet.clone();
        System.out.println("Cloned HashSet: " + clonedSet);
//        7. Write a Java program to convert a hash set to an array.
        String[] array = new String[hashSet.size()];
        hashSet.toArray(array);
        System.out.println("Array from HashSet:");
        for (String element : array) {
            System.out.println(element);
        }
//        8. Write a Java program to convert a hash set to a tree set.
        // Convert HashSet to TreeSet
        TreeSet<String> treeSet = new TreeSet<>(hashSet);
        System.out.println("TreeSet from HashSet:");
        System.out.println(treeSet);
//        10. Write a Java program to compare two hash set.
        // Create the second HashSet
        HashSet<String> set2 = new HashSet<>();
        set2.add("banana");
        set2.add("apple");
        set2.add("orange");
        boolean isEqual = hashSet.equals(set2);
        System.out.println(isEqual);
    }
}
