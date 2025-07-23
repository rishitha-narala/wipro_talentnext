package abstraction;

import java.util.*;


class InvalidCountryException extends Exception {
 public InvalidCountryException() {
     super("User Outside India cannot be registered");
 }

 public InvalidCountryException(String message) {
     super(message);
 }
}


public class UserRegistration {

 void registerUser(String username, String userCountry) throws InvalidCountryException {
     if (!userCountry.equalsIgnoreCase("India")) {
         throw new InvalidCountryException();
     } else {
         System.out.println("User registration done successfully");
     }
 }

 public static void main(String[] args) {
     Scanner sc = new Scanner(System.in);

     System.out.println("Enter username:");
     String username = sc.nextLine();

     System.out.println("Enter user country:");
     String country = sc.nextLine();

     UserRegistration reg = new UserRegistration();
     try {
         reg.registerUser(username, country);
     } catch (InvalidCountryException e) {
         System.out.println(e.getMessage());
     }

     sc.close();
 }
}
