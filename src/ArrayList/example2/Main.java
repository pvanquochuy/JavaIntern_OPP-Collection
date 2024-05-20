package ArrayList.example2;

import java.util.Iterator;
import java.util.ArrayList;


public class Main {
    public static void main(String[] args) {
        ArrayList<String> arrayList = new ArrayList<>();

        arrayList.add("Apple");
        arrayList.add("Banana");
        arrayList.add("Orange");
        arrayList.add("Grapes");

        Iterator<String> iterator = arrayList.iterator();
        while(iterator.hasNext()){
            String element = iterator.next();
            System.out.println(element);
        }

    }
}
