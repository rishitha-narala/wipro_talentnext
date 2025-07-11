package oops;
import java.util.*;

public class calculator {
	 public static int powerInt(int num1, int num2) {
	        return (int) Math.pow(num1, num2);
	    }
	 public static double powerDouble(double num1, int num2) {
	        return Math.pow(num1, num2); 
	    }

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter an integer base (num1): ");
        int intBase = sc.nextInt();
        System.out.print("Enter an integer exponent (num2): ");
        int intExponent = sc.nextInt();
        int intResult = powerInt(intBase, intExponent);
        System.out.println("Result of powerInt(" + intBase + ", " + intExponent + ") = " + intResult);
        
        System.out.print("Enter a double base (num1): ");
        double doubleBase = sc.nextDouble();
        System.out.print("Enter an integer exponent (num2): ");
        int doubleExponent = sc.nextInt();
        double doubleResult = powerDouble(doubleBase, doubleExponent);
        System.out.println("Result of powerDouble(" + doubleBase + ", " + doubleExponent + ") = " + doubleResult);

	}

}