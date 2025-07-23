package collections_problems;

import java.util.*;
import java.util.ArrayList;

public class TreeSetOperations {
    public static void main(String[] args) {
      
        TreeSet<String> ts = new TreeSet<>();
        ts.add("Apple");
        ts.add("Mango");
        ts.add("Banana");
        ts.add("Orange");
        ts.add("Grapes");

        System.out.println("Original TreeSet (Sorted Order): " + ts);

        
        List<String> reversedList = new ArrayList<>(ts);
        Collections.reverse(reversedList);
        System.out.println("Reversed Elements: " + reversedList);

        
        System.out.println("Iterating TreeSet using Iterator:");
        Iterator<String> it = ts.iterator();
        while (it.hasNext()) {
            System.out.println(it.next());
        }

       
        String searchItem = "Banana";
        if (ts.contains(searchItem)) {
            System.out.println(searchItem + " exists in the TreeSet.");
        } else {
            System.out.println(searchItem + " does NOT exist in the TreeSet.");
        }
    }
}
