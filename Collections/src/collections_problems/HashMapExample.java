package collections_problems;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class HashMapExample {
    public static void main(String[] args) {

        HashMap<String, String> map = new HashMap<>();

       
        map.put("101", "Alice");
        map.put("102", "Bob");
        map.put("103", "Charlie");
        map.put("104", "Diana");

        
        String keyToCheck = "102";
        if (map.containsKey(keyToCheck)) {
            System.out.println("Key '" + keyToCheck + "' exists in the map.");
        } else {
            System.out.println("Key '" + keyToCheck + "' does not exist.");
        }

        
        String valueToCheck = "Charlie";
        if (map.containsValue(valueToCheck)) {
            System.out.println("Value '" + valueToCheck + "' exists in the map.");
        } else {
            System.out.println("Value '" + valueToCheck + "' does not exist.");
        }

        
        System.out.println("\nIterating through the HashMap using Iterator:");
        Set<Map.Entry<String, String>> entrySet = map.entrySet();
        Iterator<Map.Entry<String, String>> iterator = entrySet.iterator();

        while (iterator.hasNext()) {
            Map.Entry<String, String> entry = iterator.next();
            System.out.println("Key: " + entry.getKey() + ", Value: " + entry.getValue());
        }
    }
}
