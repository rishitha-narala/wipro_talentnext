package collections_problems;

import java.util.Vector;
import java.util.Iterator;
import java.util.Enumeration;


class Employee {
    private int id;
    private String name;

   
    public Employee(int id, String name) {
        this.id = id;
        this.name = name;
    }

    
    public String toString() {
        return "Employee ID: " + id + ", Name: " + name;
    }
}

public class EmployeeVector {
    public static void main(String[] args) {
        
        Vector<Employee> employees = new Vector<>();

        
        employees.add(new Employee(101, "Alice"));
        employees.add(new Employee(102, "Bob"));
        employees.add(new Employee(103, "Charlie"));

       
        System.out.println("Employees (using Iterator):");
        Iterator<Employee> iterator = employees.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

        
        System.out.println("\nEmployees (using Enumeration):");
        Enumeration<Employee> enumeration = employees.elements();
        while (enumeration.hasMoreElements()) {
            System.out.println(enumeration.nextElement());
        }
    }
}
