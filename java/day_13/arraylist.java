package day_13;
import java.util.ArrayList;
public class arraylist {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("Hello");
        list.add("World");
        list.add("Java");

        System.out.println("ArrayList: " + list);
        System.out.println("Size: " + list.size());
        System.out.println("Element at index 1: " + list.get(1));

        list.remove(0);
        System.out.println("After removing index 0: " + list);

        list.clear();
        System.out.println("After clearing the list: " + list);
    }
}
