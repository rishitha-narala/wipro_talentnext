package collections_problems;


import java.util.HashSet;
import java.util.Iterator;

public class EmployeeHashSet {
    public static void main(String[] args) {
        
        HashSet<String> employeeSet = new HashSet<>();

     
        employeeSet.add("Anjali");
        employeeSet.add("Rahul");
        employeeSet.add("Priya");
        employeeSet.add("Kiran");
        employeeSet.add("Manoj");

      
        System.out.println("Employee Names:");
        Iterator<String> iterator = employeeSet.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
}
