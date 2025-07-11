package oops;

import java.util.*;
class Person {
    private String name;

    // Constructor
    public Person(String name) {
        this.name = name;
    }

    // Getter
    public String getName() {
        return name;
    }

    // Setter
    public void setName(String name) {
        this.name = name;
    }
}

class Employee extends Person {
    private double annualSalary;
    private int yearStarted;
    private String nationalInsuranceNumber;

    // Constructor
    public Employee(String name, double annualSalary, int yearStarted, String nationalInsuranceNumber) {
        super(name); // Call superclass constructor
        this.annualSalary = annualSalary;
        this.yearStarted = yearStarted;
        this.nationalInsuranceNumber = nationalInsuranceNumber;
    }

    // Getters
    public double getAnnualSalary() {
        return annualSalary;
    }

    public int getYearStarted() {
        return yearStarted;
    }

    public String getNationalInsuranceNumber() {
        return nationalInsuranceNumber;
    }

    // Setters
    public void setAnnualSalary(double annualSalary) {
        this.annualSalary = annualSalary;
    }

    public void setYearStarted(int yearStarted) {
        this.yearStarted = yearStarted;
    }

    public void setNationalInsuranceNumber(String nationalInsuranceNumber) {
        this.nationalInsuranceNumber = nationalInsuranceNumber;
    }

    // Method to display employee details
    public void displayEmployeeDetails() {
        System.out.println("Name: " + getName());
        System.out.println("Annual Salary: " + annualSalary);
        System.out.println("Year Started: " + yearStarted);
        System.out.println("National Insurance Number: " + nationalInsuranceNumber);
    }
}

public class TestEmployee {
    public static void main(String[] args) {
        // Create an Employee object
        Employee emp = new Employee("Alice Johnson", 60000.0, 2018, "NI123456A");

        // Display employee details
        System.out.println("Employee Details:");
        emp.displayEmployeeDetails();

        // Modify some data
        emp.setAnnualSalary(65000.0);
        emp.setYearStarted(2019);

        // Display updated details
        System.out.println("\nUpdated Employee Details:");
        emp.displayEmployeeDetails();
    }
}