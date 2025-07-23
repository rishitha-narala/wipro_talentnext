package collections_problems;

import java.util.TreeMap;
import java.util.Map;

public class MonthListUsingTreeMap {
    public static void main(String[] args) {
        
        TreeMap<Integer, String> months = new TreeMap<>();

        
        months.put(1, "January");
        months.put(2, "February");
        months.put(3, "March");
        months.put(4, "April");
        months.put(5, "May");
        months.put(6, "June");
        months.put(7, "July");
        months.put(8, "August");
        months.put(9, "September");
        months.put(10, "October");
        months.put(11, "November");
        months.put(12, "December");

       
        System.out.println("Months of the year (using TreeMap):");
        for (Map.Entry<Integer, String> entry : months.entrySet()) {
            System.out.println("Month " + entry.getKey() + ": " + entry.getValue());
        }
    }
}
