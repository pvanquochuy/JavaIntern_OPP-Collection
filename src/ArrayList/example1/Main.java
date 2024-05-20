package ArrayList.example1;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<String> colors = new ArrayList<>();
        colors.add("blue");
        colors.add("yellow");
        for(String color : colors){
            System.out.println(color);
        }
    }
}
