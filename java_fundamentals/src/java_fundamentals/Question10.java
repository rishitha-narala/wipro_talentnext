package java_fundamentals;
import java.util.*;

public class Question10 {

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		String gender = sc.nextLine();
		int age = sc.nextInt();
		
		if (gender.equalsIgnoreCase("female")) {
            if (age >= 1 && age <= 58) {
                System.out.println("Interest rate: 8.2%");
            } else if (age >= 59 && age <= 100) {
                System.out.println("Interest rate: 9.2%");
            } else {
                System.out.println("Invalid age.");
            }
        } else if (gender.equalsIgnoreCase("male")) {
            if (age >= 1 && age <= 58) {
                System.out.println("Interest rate: 8.4%");
            } else if (age >= 59 && age <= 100) {
                System.out.println("Interest rate: 10.5%");
            } else {
                System.out.println("Invalid age.");
            }
        } else {
            System.out.println("Invalid gender.");
        }

	}

}