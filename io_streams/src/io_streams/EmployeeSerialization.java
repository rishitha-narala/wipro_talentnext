package io_streams;


import java.io.*;
import java.util.Date;

public class EmployeeSerialization {
    public static void main(String[] args) {
        
        Employee emp = new Employee(
            "Rahul Sharma",
            new Date(1999 - 1900, 4, 15), 
            "IT",
            "Software Engineer",
            75000.00
        );

        
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("data"))) {
            oos.writeObject(emp);
            System.out.println("Employee object has been serialized to file 'data'.");
        } catch (IOException e) {
            System.out.println("Error during serialization: " + e.getMessage());
        }

       
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream("data"))) {
            Employee deserializedEmp = (Employee) ois.readObject();
            System.out.println("\nDeserialized Employee:");
            System.out.println(deserializedEmp);
        } catch (IOException | ClassNotFoundException e) {
            System.out.println("Error during deserialization: " + e.getMessage());
        }
    }
}

class Employee implements Serializable {
    private String name;
    private Date dateOfBirth;
    private String department;
    private String designation;
    private double salary;

    
    public Employee() {}

   
    public Employee(String name, Date dateOfBirth, String department, String designation, double salary) {
        this.name = name;
        this.dateOfBirth = dateOfBirth;
        this.department = department;
        this.designation = designation;
        this.salary = salary;
    }

    

    @Override
    public String toString() {
        return "Employee Details:\n" +
               "Name: " + name + "\n" +
               "DOB: " + dateOfBirth + "\n" +
               "Department: " + department + "\n" +
               "Designation: " + designation + "\n" +
               "Salary: " + salary;
    }
}
