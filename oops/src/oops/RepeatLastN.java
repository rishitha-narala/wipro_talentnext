package oops;
import java.util.*;
public class RepeatLastN {
    public static String repeatLastN(String str, int n) {
        // Get last n characters
        String lastN = str.substring(str.length() - n);
        
        // Repeat lastN n times
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < n; i++) {
            result.append(lastN);
        }
        
        return result.toString();
    }

    public static void main(String[] args) {
        // Example
        String input = "Wipro";
        int n = 3;

        String output = repeatLastN(input, n);
        System.out.println("Output: " + output); // Output: propropro
    }
}