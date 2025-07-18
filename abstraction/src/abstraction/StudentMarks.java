package abstraction;
import java.util.*;


class NegativeValueException extends Exception {
 public NegativeValueException(String message) {
     super(message);
 }
}


class OutOfRangeException extends Exception {
 public OutOfRangeException(String message) {
     super(message);
 }
}

public class StudentMarks {

 public static void main(String[] args) {
     Scanner sc = new Scanner(System.in);

     int numStudents = 2;
     for (int s = 1; s <= numStudents; s++) {
         System.out.println("Enter name of Student " + s + ": ");
         String name = sc.nextLine();

         int[] marks = new int[3];
         boolean validInput = true;

         try {
             for (int i = 0; i < 3; i++) {
                 System.out.println("Enter marks for Subject " + (i + 1) + ": ");
                 String input = sc.nextLine();
                 int mark = Integer.parseInt(input);

                 if (mark < 0) {
                     throw new NegativeValueException("Negative marks are not allowed.");
                 }

                 if (mark > 100) {
                     throw new OutOfRangeException("Marks should be between 0 and 100.");
                 }

                 marks[i] = mark;
             }

             int total = marks[0] + marks[1] + marks[2];
             double average = total / 3.0;
             System.out.println("Average marks for " + name + ": " + average);

         } catch (NumberFormatException e) {
             System.out.println("NumberFormatException: Please enter valid integers for marks.");
             validInput = false;
         } catch (NegativeValueException | OutOfRangeException e) {
             System.out.println(e);
             validInput = false;
         }

         if (!validInput) {
             System.out.println("Invalid input. Moving to next student.\n");
         }

         System.out.println("----------------------------------");
     }

     sc.close();
 }
}