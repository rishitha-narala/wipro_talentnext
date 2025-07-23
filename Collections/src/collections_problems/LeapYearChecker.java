package collections_problems;


import java.util.Calendar;

public class LeapYearChecker {
    public static void main(String[] args) {
       
        int year = Calendar.getInstance().get(Calendar.YEAR);
        System.out.println("Current Year: " + year);

      
        if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
            System.out.println(year + " is a Leap Year.");
        } else {
            System.out.println(year + " is NOT a Leap Year.");
        }
    }
}