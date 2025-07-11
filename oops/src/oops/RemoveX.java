package oops;
import java.util.*;

public class RemoveX {
    public static String withoutX(String str) {
        int len = str.length();

        if (len == 0) {
            return str; // Return empty string as-is
        }

        if (str.charAt(0) == 'x') {
            str = str.substring(1); // remove first char
            len--;
        }

        if (len > 0 && str.charAt(str.length() - 1) == 'x') {
            str = str.substring(0, str.length() - 1); // remove last char
        }

        return str;
    }

    public static void main(String[] args) {
        // Example 1
        String input1 = "xHix";
        System.out.println("Input: " + input1);
        System.out.println("Output: " + withoutX(input1)); // Output: Hi

        // Example 2
        String input2 = "America";
        System.out.println("Input: " + input2);
        System.out.println("Output: " + withoutX(input2)); // Output: America

        // Example 3: both x
        String input3 = "xHellox";
        System.out.println("Input: " + input3);
        System.out.println("Output: " + withoutX(input3)); // Output: Hello

        // Example 4: single x
        String input4 = "x";
        System.out.println("Input: " + input4);
        System.out.println("Output: " + withoutX(input4)); // Output: (empty)
    }
}