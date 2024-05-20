package HashMap;

import java.util.HashMap;
import java.util.Map;


public class Main {
    public static void main(String[] args) {
//        1. Write a Java program to associate the specified value with the specified key in a HashMap.
        HashMap<String, Integer> hashMap = new HashMap<>();

        hashMap.put("key1", 10);
        hashMap.put("key2", 20);
        hashMap.put("key3", 30);
        System.out.println("HashMap: " + hashMap);
//        2. Write a Java program to count the number of key-value (size) mappings in a map.
        int size = hashMap.size();
//        3. Write a Java program to copy all mappings from the specified map to another map.
        Map<String, Integer> destinationMap = new HashMap<>();
        destinationMap.putAll(hashMap);
        System.out.println("Destination Map after copying all mappings:");
        System.out.println(destinationMap);
//        4. Write a Java program to remove all mappings from a map.
//        hashMap.clear();
//        5. check empty
            hashMap.isEmpty();
//        6. Write a Java program to get a shallow copy of a HashMap instance.
        // Get a shallow copy of the original HashMap
        HashMap<String, Integer> shallowCopy = (HashMap<String, Integer>) hashMap.clone();
        System.out.println("Shallow Copy HashMap: " + shallowCopy);
//        7. Write a Java program to test if a map contains a mapping for the specified key.
        String keyToTest = "key2";
        if (hashMap.containsKey(keyToTest)) {
            System.out.println("The map contains a mapping for the key: " + keyToTest);
        } else {
            System.out.println("The map does not contain a mapping for the key: " + keyToTest);
        }
//        10. Write a Java program to get the value of a specified key in a map.
        // Key to get the value for
        String keyToGet = "key2";
        // Get the value for the specified key
        Integer value = hashMap.get(keyToGet);
        if (value != null) {
            System.out.println("Value for the key " + keyToGet + ": " + value);
        } else {
            System.out.println("No value found for the key: " + keyToGet);
        }
    }
}
